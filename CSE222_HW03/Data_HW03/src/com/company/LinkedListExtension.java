package com.company;

import java.util.LinkedList;
/**
 * Premium LinkedList class. LinkledClass + disabled(),
 * enabled();showDisabled() method.
 * Extends java.util.LinkedList
 */
public class LinkedListExtension<E> extends LinkedList<E> {


    private LinkedList<E> disabled;
    private LinkedList<Konum<E> > konumList;
    private boolean firstDisable = true;

    /**
     * Constructor for LinkedListExtansion.
     * disabled and konumList is initialized.
     */
    LinkedListExtension(){
        disabled = new LinkedList<>();
        konumList = new LinkedList<>();
        toFill();
    }

    /**
     * disable method, disabled any node in LinkedList by given index.
     * @param index is Course Code in csv file.
     */
    public void disable(int index){
        if(firstDisable) {
            toFill();
            firstDisable = false;
        }
        disabled.add(this.get(index));
        this.remove(index);
    }

    /**
     * showDisabled method, show all disable node in disabled LinkedList.
     */
    public void showDisabled(){
        for( int i=0;i<disabled.size();++i){
            System.out.println(disabled.get(i));
        }
    }
    /**
     * enable method, enable any node in disabled LinkedList by given index.
     * @param e is Course Code in csv file.
     */
    public void enable(E e) {
        for (int i = 0; i < disabled.size(); ++i) {
            if (disabled.get(i).equals(e)) {

                for (int k = 0; k < konumList.size(); ++k) {
                    if (konumList.get(k).data.equals(e)) {
                        this.add(k, disabled.get(i));
                        disabled.remove(i);
                    }
                }
            }
        }
    }

    /**
     * toFill for fill konumList LinkedList. And it's mapping actual position of real data.
     */
    public void toFill(){
        for(int i=0; i<this.size();++i) {
            Konum <E> kon = new Konum<>();
            kon.data = this.get(i);
            kon.konum = i;
            konumList.add(kon);
        }
    }




}
