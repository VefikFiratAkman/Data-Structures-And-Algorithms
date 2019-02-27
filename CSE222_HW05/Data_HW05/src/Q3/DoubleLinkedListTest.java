package Q3;

import org.junit.Test;

import javax.xml.soap.Node;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class DoubleLinkedListTest {

    @Test
    public void add() {
        LinkedList<Integer> head = new LinkedList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        LinkedList<Integer> headNode = new LinkedList<>();
        int size = 0;

        if(head == null)
        {
            temp = null;
            ++size;

            return;
        }

        headNode = temp;
        temp = headNode;
        ++size;
    }

    @Test
    public void addAll() {
        LinkedList<Integer> other = new LinkedList<>();
        for(int i=0; i<other.size();++i){
            add();
        }
    }

    @Test
    public void get() {
        LinkedList<Integer> head = new LinkedList<>();
        int index = 0;

        if(index == 0) {


        }
        else {
            for (int i = 0; i < index; ++i) {

            }

        }
    }

    @Test
    public void size() {
        int size = 5;
        assert  true;
    }



    @Test
    public void removeFirst() {
        LinkedList<Integer> test = new LinkedList<>();
        test.add(12);
        test.removeFirst();
        assert true;
     }
}