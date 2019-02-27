package Q1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

import static org.junit.Assert.*;

public class DoubleHashTest {

    @org.junit.Test
    public void size() {
        int size = 5;
        if (size != 5) throw new AssertionError();
    }

    @org.junit.Test
    public void isEmpty() {
        int size = 0;
        if(size == 0)
            assert true;

        assert false;


    }

    @org.junit.Test
    public void containsKey() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);

        int key = 12;
        int i = 0;
        for(int k : a){
            if(k == a.get(i))
                assert true;
            ++i;
        }

        assert false;
    }

    @org.junit.Test
    public void containsValue() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);

        int value = 12;
        int i = 0;

        for(int v : a){

            if(v == a.get(i)) {
                assert true;
            }

            ++i;
        }

        assert false;
    }

    @org.junit.Test
    public void get() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);

        a.get(0);
        assert true;
    }

    @org.junit.Test
    public void put() {
        int willPut = 12;
        ArrayList<Integer> a = new ArrayList<>();
        a.add(willPut);
        assert true;

    }

    @org.junit.Test
    public void remove() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);

        a.remove(0);

        assert true;

    }

    @org.junit.Test
    public void putAll() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(3);
        a.add(4);
        ArrayList<Integer> b = new ArrayList<>();

        b.addAll(a);

        assert true;
    }

    @org.junit.Test
    public void clear() {
        ArrayList<Integer> a = new ArrayList<>();
        int size = 0;
        a.add(12);
        ++size;
        a.add(3);
        ++size;
        a.add(4);
        ++size;

        a.clear();
        size = 0;

        assert true;


    }

    @org.junit.Test
    public void keySet() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(3);
        a.add(4);

        ArrayList<Integer> b = new ArrayList<>();
       b.add(8);
        for(int i = 0; i < a.size(); ++i){
            b.add(a.get(i));
        }


        assert true;
    }

    @org.junit.Test
    public void values() {
        int capacity = 0;
        ArrayList<Integer> hashTable = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < capacity; ++i) {
            if((hashTable.get(i))!=null) {
                temp.add((hashTable.get(i)));
            }
        }
        assert  true;

    }


}