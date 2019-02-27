package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void add() {
        LinkedList newNode = new LinkedList();
        LinkedList last = new LinkedList();
        LinkedList l = new LinkedList();
        LinkedList first = new LinkedList();
        int size = 0;

        Course x = new Course();

        last = newNode;
        if (l == null)
            first = newNode;
        ++size;

    }

    @Test
    public void connecter() {
        ArrayList<Integer> semesterNumber = new ArrayList<>();
        int bigSemester = 0;
        LinkedList<Course> newNode = new LinkedList();
        LinkedList<Course> last = new LinkedList();
        LinkedList<Course> xxx = new LinkedList();
        LinkedList<Course> first = new LinkedList();
        int size = 0;


        boolean firstbool = true;


        for (int i = 0; i < size; ++i) {
            semesterNumber.add(i, 0);
        }

        for (int i = 0; i <size; ++i) {
            if (xxx.get(i).semester > bigSemester) {
                bigSemester = xxx.get(i).semester;
            }

        }


        for (int k = 0; k < bigSemester; ++k) {
            LinkedList<Course> temp = first;
            for (int i = 0; i < size; ++i) {
                if (temp.get(i).semester == k + 1) {
                    semesterNumber.set(k, semesterNumber.get(k) + 1);
                }


            }
        }

        for (int k = 0; k < bigSemester; ++k) {
            LinkedList<Course> firstT = first;
            LinkedList<Course> temp = first;
            LinkedList<Course> temp2 = first;
            for (int i = 0; i < size && semesterNumber.get(k) >= 0; ++i, semesterNumber.set(k, semesterNumber.get(k) - 1)) {


                if ((temp.get(i).semester == k + 1  && semesterNumber.get(k) > 0 && firstbool)) {
                    firstbool = false;
                    firstT = temp;
                    temp2 = temp;

                } else if ((temp.get(i).semester == k + 1 && !firstbool) && semesterNumber.get(k) > 0) {


                } else if ((temp.get(i).semester == k + 1 && !firstbool) && semesterNumber.get(k) == 0) {


                }


            }

        }
    }

    @Test
    public void size() {
        int size = 0;
        //return size;
    }

    @Test
    public void remove() throws Exception {
        int index = 0;
        LinkedList<Course> first = new LinkedList<>();
        Course x = new Course();
        first.add(x);
        int size = 1;

        if(index == 0){
            first.remove(index);
        }

        if (index <0 || index >size){
            throw new Exception("Index Out of bounds.");
        }
    }

    @Test
    public void get() throws Exception {
        int index =1;
        int size = 3;

        if(index >= 0 && index < size){
            Course x = new Course();

        }
        else {
            throw new Exception("Index is out ouf bond.");
        }
    }
}