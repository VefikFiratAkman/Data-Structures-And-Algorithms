package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedList {

     class Node{

        public Course data = new Course();



        public Node next;
        public Node nextSpec;

        Node(){
            next = null;
            nextSpec = null;

        }

        Node(Course e,Node nex,Node nexSpecial){

            next = nex;
            data = e;
            nextSpec = nexSpecial;

        }

    }


    private Node first;
    private Node current;
    private Node last;

    private int size = 0;
    /**
     * Appends the specified element to the end of this list.
     * @return if add element completed succesfully return true.
     * Otherwise return false.
     * @param e any Course object
     */
    public boolean add(Course e) {

        final Node l = last;
        final Node newNode = new Node(e, null, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        ++size;
        current = first;

        return true;
    }


    /**
     * connecter Aynı semester da olan courseları  sırayla birbirlerine
     * ozel olarak baglar. Semesterın en son node'uda o semesterın
     * ilk noduna baglar. Circulardır.
     */
    public void connecter() {
        ArrayList<Integer> semesterNumber = new ArrayList<>();
        int bigSemester = 0;
        Node xxx = first;



        boolean firstbool = true;


        for (int i = 0; i < size; ++i) {
            semesterNumber.add(i, 0);
        }

        for (int i = 0; i < this.size; ++i) {
            if (xxx.data.semester > bigSemester) {
                bigSemester = xxx.data.semester;
            }
            xxx = xxx.next;
        }


        for (int k = 0; k < bigSemester; ++k) {
            Node temp = first;
            for (int i = 0; i < size; ++i) {
                if (temp.data.semester == k + 1) {
                    semesterNumber.set(k, semesterNumber.get(k) + 1);
                }
                temp = temp.next;

            }
        }

        for (int k = 0; k < bigSemester; ++k) {
            Node firstT = first;
            Node temp = first;
            Node temp2 = first;
            for (int i = 0; i < size && semesterNumber.get(k) >= 0; ++i, semesterNumber.set(k, semesterNumber.get(k) - 1)) {


                if ((temp.data.semester == k + 1  && semesterNumber.get(k) > 0 && firstbool)) {
                    firstbool = false;
                    firstT = temp;
                    temp2 = temp;

                } else if ((temp.data.semester == k + 1 && !firstbool) && semesterNumber.get(k) > 0) {

                    temp2.nextSpec = temp;
                    temp2 = temp;

                } else if ((temp.data.semester == k + 1 && !firstbool) && semesterNumber.get(k) == 0) {

                    temp.nextSpec = firstT;
                    temp2.nextSpec = firstT;

                }
                temp = temp.next;

            }

        }
    }

    /**
     * next nodelar arasında düz bir şekilde ilerlemeyi
     * saglar.
     * Note: Garbage collector ilerledigimde geri de kalan
     * nodelarimi siliyor. Cozemedim.
     * @return Course
     */
    public Course next() {

        current = current.next;
        return current.data;
    }

    /**
     * nextInSemester nodelar arasında aynı semesterda olanlar
     * arasında ilerier. O semesterda ki tüm courselara giderse
     * basa geri döner. Circulardır.
     * Note: Garbage collector ilerledigimde geri de kalan
     * nodelarimi siliyor. Cozemedim.
     * @return Course
     */
    public Course nextInSemester(){
        current = current.nextSpec;
        return current.data;
    }

    /**Returns the number of elements in this list.
     * @return size
     */
    public int size(){
        return size;
    }

    /**
     * Removes the element at the specified position in this list.
     * Throws Exception if this list is empty.
     * @param index for node
     * @return true if remove successfully completed. otherwise false
     * @throws  Exception if index is wrong.
     */
    public boolean remove(int index) throws Exception {
        if(index == 0){
            first = first.next;

        }
        else{

            Node bef = this.node(index-1);
            Node af = this.node(index-1);
            bef.next = af;
        }
        if (index <0 || index >size){
            throw new Exception("Index Out of bounds.");
        }

        return true;
    }

    /**
     *
     * Returns the element at the specified position in this list.
     * Throws Exception if the specified index is out of range
     * @return Course
     * @param index for node
     * @throws Exception if no match node.
     */
    public Course get(int index) throws Exception {
        if(index >= 0 && index < size){
            return node(index).data;
        }
        else {
            throw new Exception("Index is out ouf bond.");
        }
    }
    /**
     * @param index for node
     * @return Returns the (non-null) Node at the specified element index.
     * @throws Exception if no match node.
     */
    private Node node(int index) throws Exception {
        // assert isElementIndex(index);

        if(index >= 0 && index < size){

            Node x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        }
        else{
            throw new Exception("Index out of bound.");
        }
    }





}
