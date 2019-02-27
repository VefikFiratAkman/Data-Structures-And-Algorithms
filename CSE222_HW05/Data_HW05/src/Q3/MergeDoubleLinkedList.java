package Q3;

import java.util.LinkedList;
import java.util.List;

/**
 * DoubleLinkedList uzerinde calisan
 * mergesort icin yazilmis bir classtir.
 */
public class MergeDoubleLinkedList {


    /**
     * iki listeyi merge sortuna uygun birlesitirir yani mergeler.
     * @param left mergelenecek listelerden biri
     * @param right mergelenecek listelerden ikincisi
     * @param <T> generictir.
     * @return mergelenmis list return eder.
     */
    private  <T extends Comparable<T>> DoubleLinkedList<T> merger(DoubleLinkedList<T> left,DoubleLinkedList<T> right) {


        DoubleLinkedList<T> result = new DoubleLinkedList<T>();

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
        return result;
    }

    /**
     * listenin merge metodu ile sort edilmesini saglar.
     * @param list sort edilecek listediçr
     * @param <T> generictir.
     * @return sort edilmis liste return eder.
     */
    public  <T extends Comparable<T>> DoubleLinkedList<T> sorter(DoubleLinkedList<T> list) {

        DoubleLinkedList<T> result;
        DoubleLinkedList<T> left   = new DoubleLinkedList<T>();
        DoubleLinkedList<T> right  = new DoubleLinkedList<T>();
        int middle;
        int addNum;

        if(list.size() <= 1) {
            return list;
        }

        middle = list.size() / 2;

        addNum = 0;

        for(int i=0; i< list.size();++i){
            if(addNum < middle){
                left.add(list.get(i));
                ++addNum;
            }
            else{
                right.add(list.get(i));
            }
        }
        left = sorter(left);
        right = sorter(right);

        result = merger(left, right);

        return result;
    }




}
