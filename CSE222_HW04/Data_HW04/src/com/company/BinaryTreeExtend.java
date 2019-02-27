package com.company;


import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/** This is extended class from BinaryTree class.
 * We will use this class for general tree to
 * binary tree conversion.
 */
public class BinaryTreeExtend<E> extends BinaryTree<E>{



    /** Implements the Queue interface using a circular array.
     *  @author Koffman and Wolfgang
     * */

    public class ArrayQueue < E >
            extends AbstractQueue< E >
            implements Queue< E > {

        // Data Fields
        /** Index of the front of the queue. */
        private int front;

        /** Index of the rear of the queue. */
        private int rear;

        /** Current size of the queue. */
        private int size;

        /** Current capacity of the queue. */
        private int capacity;

        /** Default capacity of the queue. */
        private static final int DEFAULT_CAPACITY = 10;

        /** Array to hold the data. */
        private E[] theData;

        // Constructors
        /** Construct a queue with the default initial capacity.
         */
        public ArrayQueue() {
            this(DEFAULT_CAPACITY);
        }

        /** Construct a queue with the specified initial capacity.
         @param initCapacity The initial capacity
         */
        public ArrayQueue(int initCapacity) {
            capacity = initCapacity;
            theData = (E[])new Object[capacity];
            front = 0;
            rear = capacity - 1;
            size = 0;
        }

        // Public Methods
        /** Inserts an item at the rear of the queue.
         post: item is added to the rear of the queue.
         @param item The element to add
         @return true (always successful)
         */
        public boolean offer(E item) {
            if (size == capacity) {
                reallocate();
            }
            size++;
            rear = (rear + 1) % capacity;
            theData[rear] = item;
            return true;
        }

        /** Returns the item at the front of the queue without removing it.
         @return The item at the front of the queue if successful;
         return null if the queue is empty
         */
        public E peek() {
            if (size == 0)
                return null;
            else
                return theData[front];
        }

        /** Removes the entry at the front of the queue and returns it
         if the queue is not empty.
         post: front references item that was second in the queue.
         @return The item removed if successful or null if not
         */
        public E poll() {
            if (size == 0) {
                return null;
            }
            E result = theData[front];
            front = (front + 1) % capacity;
            size--;
            return result;
        }

        /** BEGIN EXERCISE **/
        /** Return the size of the queue
         @return The number of items in the queue
         */
        public int size() {
            return size;
        }

        /** Determine if the queue is empty
         @return true if the queue is empty
         */
        public boolean isEmpty() {
            return size == 0;
        }

        public Iterator< E > iterator() {
            return new Iter();
        }

        /** END EXERCISE **/

        // Private Methods
        /** Double the capacity and reallocate the data.
         pre: The array is filled to capacity.
         post: The capacity is doubled and the first half of the
         expanded array is filled with data.
         */
        private void reallocate() {
            int newCapacity = 2 * capacity;
            E[] newData = (E[])new Object[newCapacity];
            int j = front;
            for (int i = 0; i < size; i++) {
                newData[i] = theData[j];
                j = (j + 1) % capacity;
            }
            front = 0;
            rear = size - 1;
            capacity = newCapacity;
            theData = newData;
        }

        /** Inner class to implement the Iterator<E> interface. */
        private class Iter
                implements Iterator < E > {
            // Data Fields
            // Index of next element */
            private int index;

            // Count of elements accessed so far */
            private int count = 0;

            // Methods
            // Constructor
            /** Initializes the Iter object to reference the
             first queue element.
             */
            public Iter() {
                index = front;
            }

            /** Returns true if there are more elements in the queue to access. */
            public boolean hasNext() {
                return count < size;
            }

            /** Returns the next element in the queue.
             pre: index references the next element to access.
             post: index and count are incremented.
             @return The element with subscript index
             */
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E returnValue = theData[index];
                index = (index + 1) % capacity;
                count++;
                return returnValue;
            }

            /** Remove the item accessed by the Iter object � not implemented. */
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

    }


    private Node<E> temp = null;




    /**
     * This is a recursive function.
     * This function search tree with post order method.
     * @param target is target data for search in tree.
     * @param rootParam is root node in parameter
     * @throws Exception for parameter root is null
     */

    private void postOrderSearch(E target, Node<E> rootParam) throws Exception {

        if(rootParam == null){
            throw new Exception();
        }
        if(target == null){
            throw new Exception("Please give a significant target");
        }



        if (rootParam.left != null) {

            postOrderSearch(target, rootParam.left);

        }

        if (rootParam.data == target){

            temp = rootParam;

        }
        if (rootParam.right != null) {

            postOrderSearch(target, rootParam.right);

        }

    }

    /**
     * This function search tree with post order method.
     * @param target is target data for search in tree.
     * @return Node from target in a tree.
     * @throws Exception because call postOrderSearch(2)
     */
    public Node<E> postOrderSearch(E target) throws Exception {
        if(target == null){
            throw new Exception("Please give a significant target");
        }

        postOrderSearch(target,root);

        return temp;

    }

    /**
     * This function search tree with level order method.
     * @param target is target data for search in tree.
     * @return Node from target in a tree.
     * @throws Exception if target is null
     */
    private Node<E> levelOrderSearch(E target) throws Exception {

            Node<E> curr = null;
            ArrayQueue<Node<E>> Q = new ArrayQueue<Node<E>>();

            if(target == null){
                throw new Exception("Please give a significant target");
            }

            if (root == null) {
                return null;
            }


            else {
                Q.offer(root);

                while (Q.size() != 0) {

                    if (target != Q.peek().data) {

                        if (Q.peek().left == null) {

                            Q.poll();

                        }

                        else {

                            curr = Q.poll().left;
                            Q.offer(curr);

                            while (curr.right != null) {

                                curr = curr.right;
                                Q.offer(curr);

                            }

                        }

                    }

                    else {

                        return Q.poll();

                    }

                }

                return null;

            }

        }


    /**
     * Return tree as a string
     * but tree node ordered by pre order method
     * @return String
     */
    public String preOrderTraverse(){

        if(root == null){

         return "Error: Root is null.";

        }

        else{

        StringBuilder sb = new StringBuilder();
        preOrder(sb,root);

        return sb.toString();

        }
    }

    /**
     * This is a recursive function.
     * add tree node  as a string to sb
     * but tree node ordered by pre order method
     * @param sb for take node
     * @param rootParam for root of tree as a parameter
     */
    private void preOrder(StringBuilder sb, Node<E> rootParam){

        sb.append(rootParam.data.toString()+" ");


        if (rootParam.left != null) {

            preOrder(sb, rootParam.left);

        }

        if (rootParam.right != null) {

            preOrder(sb, rootParam.right);

        }

    }

    /**
     * This function add new data to tree.
     * And it is use parent,child parameter for
     * location of new data.
     * @param parent for parent of new data. But parent must be null for first data.
     * @param child it is new data for a tree.
     * @return boolean if add successful return true, otherwise return false.
     * @throws Exception if child is null
     */
    public boolean add(E parent,E child) throws Exception {

        if(child == null){
            throw new Exception("You must give valid child.");
        }


        if (root != null){

            Node curr = levelOrderSearch(parent);

            if (curr != null) {

                if (curr.left != null) {

                    curr = curr.left;

                    while (curr.right != null) {

                        curr = curr.right;

                    }

                    curr.right = new Node(child);
                    return true;


                }
                else{

                    curr.left = new Node(child);
                    return true;

                }

            }

            return false;

        }
        else{

            root = new Node(child);
            return true;

        }


    }


}

