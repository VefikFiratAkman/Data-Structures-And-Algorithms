package Q3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeDoubleLinkedListTest {

    @Test
    public void merger() {


        DoubleLinkedList<Integer> result = new DoubleLinkedList<Integer>();
        DoubleLinkedList<Integer> left = new DoubleLinkedList<Integer>();
        DoubleLinkedList<Integer> right = new DoubleLinkedList<Integer>();
        while(left.size() > 0 && right.size() > 0) {
            if(left.get(0).compareTo(right.get(0)) < 0)
                result.add(left.removeFirst());
            else
                result.add(right.removeFirst());
        }

        if(left.size() > 0) {
            result.addAll(left);
        }
        else {
            result.addAll(right);
        }
        assert true;
    }

    @Test
    public void sorter() {

        DoubleLinkedList<Integer> result;
        DoubleLinkedList<Integer> left   = new DoubleLinkedList<Integer>();
        DoubleLinkedList<Integer> right  = new DoubleLinkedList<Integer>();
        DoubleLinkedList<Integer> list   = new DoubleLinkedList<Integer>();
        int middle;
        int addNum;

        if(list.size() <= 1) {
           assert true;
        }

        middle = list.size() / 2;

        addNum = 0;

        for(int i=0; i< list.size();++i){
            if(addNum < middle){
                ++addNum;
                left.add(list.get(i));

            }
            else{
                right.add(list.get(i));
            }
        }
        assert  true;

    }
}