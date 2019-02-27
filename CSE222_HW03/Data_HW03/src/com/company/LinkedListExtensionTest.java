package com.company;

import org.junit.Test;

import java.util.LinkedList;

public class LinkedListExtensionTest {

    @Test
    public void disable() {
        boolean firstDisable = true;
        LinkedList<Integer> List = new LinkedList();
        LinkedList<Integer> disabled = new LinkedList();
        int index = 1;

        List.add(23);
        List.add(12);

        disabled.add(List.get(index));
        List.remove(index);
    }

    @Test
    public void showDisabled() {
        LinkedList<Integer> List = new LinkedList();
        LinkedList<Integer> disabled = new LinkedList();
        int index = 1;

        List.add(23);
        List.add(12);

        disabled.add(List.get(index));
        List.remove(index);


        for( int i=0;i<disabled.size();++i){
            System.out.println(disabled.get(i));
        }


    }

    @Test
    public void enable() {
        LinkedList<Integer> disabled = new LinkedList();
        LinkedList<Integer> List = new LinkedList();
        int index = 1;
        disabled.add(22);
        disabled.add(44);

        List.add(disabled.get(index));
        disabled.remove(index);


    }

    @Test
    public void toFill() {
        LinkedList<Konum> konumList = new LinkedList();

        String s = " Bu ornek datadır.";

        Konum kon = new Konum<>();
            kon.data = s;
            kon.konum = 0;
            konumList.add(kon);

    }
}