package Q5;

import Q3.DoubleLinkedList;
import Q3.MergeDoubleLinkedList;
import Q4.HeapSort;
import Q4.InsertionSort;
import Q4.QuickSort;

/**
 * Q5 sorusu icin MainTest yapilmasini saglayan
 * yardimci classdir.
 */
public class MainTest {

    public void test() {
        Integer[] worstInsertion100 = new Integer[100];
        Integer[] worstInsertion1000 = new Integer[1000];
        Integer[] worstInsertion5000 = new Integer[5000];
        Integer[] worstInsertion10000 = new Integer[10000];
        int a = 0;
        for (int i = 100; i > 0; --i) {
            worstInsertion100[a] = i;
            ++a;
        }
        int b = 0;
        for (int i = 1000; i > 0; --i) {
            worstInsertion1000[b] = i;
            ++b;
        }

        int c = 0;
        for (int i = 5000; i > 0; --i) {
            worstInsertion5000[c] = i;
            ++c;
        }

        int d = 0;
        for (int i = 10000; i > 0; --i) {
            worstInsertion10000[d] = i;
            ++d;
        }

        Integer[] worstQuick100 = worstInsertion100;
        Integer[] worstQuick1000 = worstInsertion1000;
        Integer[] worstQuick5000 = worstInsertion5000;
        Integer[] worstQuick10000 = worstInsertion10000;

        Integer[] worstHeap100 = worstInsertion100;
        Integer[] worstHeap1000 = worstInsertion1000;
        Integer[] worstHeap5000 = worstInsertion5000;
        Integer[] worstHeap10000 = worstInsertion10000;


        long aa = System.nanoTime();
        InsertionSort.sort(worstInsertion100);
        aa = System.nanoTime() - aa;

        long bb = System.nanoTime();
        InsertionSort.sort(worstInsertion1000);
        bb = System.nanoTime() - bb;

        long cc = System.nanoTime();
        InsertionSort.sort(worstInsertion5000);
        cc = System.nanoTime() - cc;

        long dd = System.nanoTime();
        InsertionSort.sort(worstInsertion10000);
        dd = System.nanoTime() - dd;


        long ee = System.nanoTime();
        QuickSort.sort(worstHeap100);
        ee = System.nanoTime() - ee;

        long ff = System.nanoTime();
        QuickSort.sort(worstHeap1000);
        ff = System.nanoTime() - ff;

        long gg = System.nanoTime();
        QuickSort.sort(worstHeap5000);
        gg = System.nanoTime() - gg;

        long hh = System.nanoTime();
        QuickSort.sort(worstHeap10000);
        hh = System.nanoTime() - hh;


        long kk = System.nanoTime();
        HeapSort.sort(worstQuick100);
        kk = System.nanoTime() - kk;

        long mm = System.nanoTime();
        HeapSort.sort(worstQuick1000);
        mm = System.nanoTime() - mm;

        long nn = System.nanoTime();
        HeapSort.sort(worstQuick5000);
        nn = System.nanoTime() - nn;

        long jj = System.nanoTime();
        HeapSort.sort(worstQuick10000);
        jj = System.nanoTime() - jj;


        Integer[] worstMerge100 = new Integer[100];
        Integer[] worstMerge1000 = new Integer[1000];
        Integer[] worstMerge5000 = new Integer[5000];
        Integer[] worstMerge10000 = new Integer[10000];

        for (int i = 0; i < 100; ++i) {
            if (i % 2 == 0) {
                worstMerge100[i] = i + 1000;
            } else {
                worstMerge100[i] = i;
            }

        }

        for (int i = 0; i < 1000; ++i) {
            if (i % 2 == 0) {
                worstMerge1000[i] = i + 1000;
            } else {
                worstMerge1000[i] = i;
            }

        }
        for (int i = 0; i < 5000; ++i) {
            if (i % 2 == 0) {
                worstMerge5000[i] = i + 1000;
            } else {
                worstMerge5000[i] = i;
            }

        }

        for (int i = 0; i < 10000; ++i) {
            if (i % 2 == 0) {
                worstMerge10000[i] = i + 1000;
            } else {
                worstMerge10000[i] = i;
            }

        }


        long a1 = System.nanoTime();
        HeapSort.sort(worstMerge100);
        a1 = System.nanoTime() - a1;

        long a2 = System.nanoTime();
        HeapSort.sort(worstMerge1000);
        a2 = System.nanoTime() - a2;

        long a3 = System.nanoTime();
        HeapSort.sort(worstMerge5000);
        a3 = System.nanoTime() - a3;

        long a4 = System.nanoTime();
        HeapSort.sort(worstMerge10000);
        a4 = System.nanoTime() - a4;


        DoubleLinkedList<Integer> worstMergeDoubleLinkedList100 = new DoubleLinkedList<>();
        DoubleLinkedList<Integer> worstMergeDoubleLinkedList1000 = new DoubleLinkedList<>();
        DoubleLinkedList<Integer> worstMergeDoubleLinkedList5000 = new DoubleLinkedList<>();
        DoubleLinkedList<Integer> worstMergeDoubleLinkedList10000 = new DoubleLinkedList<>();

        for (int i = 0; i < 100; ++i) {
            if (i % 2 == 0) {
                worstMergeDoubleLinkedList100.add(i + 1000);
            } else {
                worstMergeDoubleLinkedList100.add(i);
                ;
            }

        }

        for (int i = 0; i < 1000; ++i) {
            if (i % 2 == 0) {
                worstMergeDoubleLinkedList1000.add(i + 1000);
            } else {
                worstMergeDoubleLinkedList1000.add(i);
                ;
            }

        }
        for (int i = 0; i < 5000; ++i) {
            if (i % 2 == 0) {
                worstMergeDoubleLinkedList5000.add(i + 1000);
            } else {
                worstMergeDoubleLinkedList5000.add(i);
                ;
            }

        }

        for (int i = 0; i < 10000; ++i) {
            if (i % 2 == 0) {
                worstMergeDoubleLinkedList10000.add(i + 1000);
            } else {
                worstMergeDoubleLinkedList10000.add(i);
                ;
            }

        }

        MergeDoubleLinkedList merge = new MergeDoubleLinkedList();

        long z1 = System.nanoTime();
        merge.sorter(worstMergeDoubleLinkedList100);
        z1 = System.nanoTime() - z1;

        long z2 = System.nanoTime();
        merge.sorter(worstMergeDoubleLinkedList1000);
        z2 = System.nanoTime() - z2;

        long z3 = System.nanoTime();
        merge.sorter(worstMergeDoubleLinkedList5000);
        z3 = System.nanoTime() - z3;

        long z4 = System.nanoTime();
        merge.sorter(worstMergeDoubleLinkedList10000);
        z4 = System.nanoTime() - z4;


        System.out.println("InsertionSort Worst-Case 100" + aa);
        System.out.println("InsertionSort Worst-Case 1000" + bb);
        System.out.println("InsertionSort Worst-Case 5000" + cc);
        System.out.println("InsertionSort Worst-Case 10000" + dd);
        System.out.println("--------------------------------------------");
        System.out.println("QuickSort Worst-Case 100" + ee);
        System.out.println("QuickSort Worst-Case 1000" + ff);
        System.out.println("QuickSort Worst-Case 5000" + gg);
        System.out.println("QuickSort Worst-Case 10000" + hh);
        System.out.println("--------------------------------------------");
        System.out.println("HeapSort Worst-Case 100" + kk);
        System.out.println("HeapSort Worst-Case 1000" + mm);
        System.out.println("HeapSort Worst-Case 5000" + nn);
        System.out.println("HeapSort Worst-Case 10000" + jj);
        System.out.println("--------------------------------------------");
        System.out.println("MergeSort Worst-Case 100" + a1);
        System.out.println("MergeSort Worst-Case 1000" + a2);
        System.out.println("MergeSort Worst-Case 5000" + a3);
        System.out.println("MergeSort Worst-Case 10000" + a4);
        System.out.println("--------------------------------------------");
        System.out.println("MergeDoubleLinkedList Worst-Case 100" + z1);
        System.out.println("MergeDoubleLinkedList Worst-Case 1000" + z2);
        System.out.println("MergeDoubleLinkedList Worst-Case 5000" + z3);
        System.out.println("MergeDoubleLinkedList Worst-Case 10000" + z4);

    }
}
