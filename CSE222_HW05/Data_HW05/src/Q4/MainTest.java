package Q4;

import Q3.DoubleLinkedList;
import Q3.MergeDoubleLinkedList;

import java.util.ArrayList;
import java.util.Random;
/**
 * Q4 sorusu icin MainTest yapilmasini saglayan
 * yardimci classdir.
 */
public class MainTest {

    public  void test(){


        {
            Integer[] unsorted1 = new Integer[20];
            Integer[] unsorted2 = new Integer[10];
            Integer[] unsorted3 = new Integer[5];
            Integer[] unsorted4 = new Integer[15];
            Integer[] unsorted5 = new Integer[25];
            Integer[] unsorted6 = new Integer[45];
            Integer[] unsorted7 = new Integer[40];
            Integer[] unsorted8 = new Integer[64];
            Integer[] unsorted9 = new Integer[8];
            Integer[] unsorted10 = new Integer[17];


            Random rand = new Random();
            for (int i = 0; i < 20; ++i)
                unsorted1[i] = rand.nextInt(1000) + 1;
            for (int i = 0; i < 10; ++i)
                unsorted2[i] = rand.nextInt(1000) + 1;
            for (int i = 0; i < 5; ++i)
                unsorted3[i] = rand.nextInt(1000) + 1;
            for (int i = 0; i < 15; ++i)
                unsorted4[i] = rand.nextInt(1000) + 1;
            for (int i = 0; i < 25; ++i)
                unsorted5[i] = rand.nextInt(1000) + 1;
            for (int i = 0; i < 45; ++i)
                unsorted6[i] = rand.nextInt(1000) + 1;
            for (int i = 0; i < 40; ++i)
                unsorted7[i] = rand.nextInt(1000) + 1;
            for (int i = 0; i < 64; ++i)
                unsorted8[i] = rand.nextInt(1000) + 1;
            for (int i = 0; i < 8; ++i)
                unsorted9[i] = rand.nextInt(1000) + 1;
            for (int i = 0; i < 17; ++i)
                unsorted10[i] = rand.nextInt(1000) + 1;

            Integer[] Iunsorted1 = unsorted1;
            Integer[] Iunsorted2 = unsorted2;
            Integer[] Iunsorted3 = unsorted3;
            Integer[] Iunsorted4 = unsorted4;
            Integer[] Iunsorted5 = unsorted5;
            Integer[] Iunsorted6 = unsorted6;
            Integer[] Iunsorted7 = unsorted7;
            Integer[] Iunsorted8 = unsorted8;
            Integer[] Iunsorted9 = unsorted9;
            Integer[] Iunsorted10 = unsorted10;


            Integer[] Munsorted1 = unsorted1;
            Integer[] Munsorted2 = unsorted2;
            Integer[] Munsorted3 = unsorted3;
            Integer[] Munsorted4 = unsorted4;
            Integer[] Munsorted5 = unsorted5;
            Integer[] Munsorted6 = unsorted6;
            Integer[] Munsorted7 = unsorted7;
            Integer[] Munsorted8 = unsorted8;
            Integer[] Munsorted9 = unsorted9;
            Integer[] Munsorted10 = unsorted10;


            Integer[] Qunsorted1 = unsorted1;
            Integer[] Qunsorted2 = unsorted2;
            Integer[] Qunsorted3 = unsorted3;
            Integer[] Qunsorted4 = unsorted4;
            Integer[] Qunsorted5 = unsorted5;
            Integer[] Qunsorted6 = unsorted6;
            Integer[] Qunsorted7 = unsorted7;
            Integer[] Qunsorted8 = unsorted8;
            Integer[] Qunsorted9 = unsorted9;
            Integer[] Qunsorted10 = unsorted10;



            long aa = System.nanoTime();
            HeapSort.sort(unsorted1);
            aa = System.nanoTime() - aa;

            long bb = System.nanoTime();
            HeapSort.sort(unsorted2);
            bb = System.nanoTime() - bb;


            long cc = System.nanoTime();
            HeapSort.sort(unsorted3);
            cc = System.nanoTime() - cc;

            long dd = System.nanoTime();
            HeapSort.sort(unsorted4);
            dd = System.nanoTime() - dd;

            long ee = System.nanoTime();
            HeapSort.sort(unsorted5);
            ee = System.nanoTime() - ee;

            long ff = System.nanoTime();
            HeapSort.sort(unsorted6);
            ff = System.nanoTime() - ff;

            long gg = System.nanoTime();
            HeapSort.sort(unsorted7);
            gg = System.nanoTime() - gg;

            long hh = System.nanoTime();
            HeapSort.sort(unsorted8);
            hh = System.nanoTime() - hh;

            long kk = System.nanoTime();
            HeapSort.sort(unsorted9);
            kk = System.nanoTime() - kk;

            long mm = System.nanoTime();
            HeapSort.sort(unsorted10);
            mm = System.nanoTime() - mm;

            System.out.println("HeapSort 1.Array " + aa);
            System.out.println("HeapSort 2.Array " + bb);
            System.out.println("HeapSort 3.Array " + cc);
            System.out.println("HeapSort 4.Array " + dd);
            System.out.println("HeapSort 5.Array " + ee);
            System.out.println("HeapSort 6.Array " + ff);
            System.out.println("HeapSort 7.Array " + gg);
            System.out.println("HeapSort 8.Array " + hh);
            System.out.println("HeapSort 9.Array " + kk);
            System.out.println("HeapSort 10.Array " + mm);
            System.out.println(" --------------------- END OF HEAPSORT ---------------------------");



            long A = System.nanoTime();
            InsertionSort.sort(Iunsorted1);
            A = System.nanoTime() - A;

            long B = System.nanoTime();
            InsertionSort.sort(Iunsorted2);
            B = System.nanoTime() - B;

            long C = System.nanoTime();
            InsertionSort.sort(Iunsorted3);
            C = System.nanoTime() - C;

            long D = System.nanoTime();
            InsertionSort.sort(Iunsorted4);
            D = System.nanoTime() - D;


            long E = System.nanoTime();
            InsertionSort.sort(Iunsorted5);
            E = System.nanoTime() - E;

            long F = System.nanoTime();
            InsertionSort.sort(Iunsorted6);
            F = System.nanoTime() - F;

            long G = System.nanoTime();
            InsertionSort.sort(Iunsorted7);
            G = System.nanoTime() - G;

            long H = System.nanoTime();
            InsertionSort.sort(Iunsorted8);
            H = System.nanoTime() - H;


            long K = System.nanoTime();
            InsertionSort.sort(Iunsorted9);
            K = System.nanoTime() - K;

            long M = System.nanoTime();
            InsertionSort.sort(Iunsorted10);
            M = System.nanoTime() - M;

            System.out.println("InsertionSort 1.Array " + A);
            System.out.println("InsertionSort 2.Array " + B);
            System.out.println("InsertionSort 3.Array " + C);
            System.out.println("InsertionSort 4.Array " + D);
            System.out.println("InsertionSort 5.Array " + E);
            System.out.println("InsertionSort 6.Array " + F);
            System.out.println("InsertionSort 7.Array " + G);
            System.out.println("InsertionSort 8.Array " + H);
            System.out.println("InsertionSort 9.Array " + K);
            System.out.println("InsertionSort 10.Array " + M);
            System.out.println(" --------------------- END OF INSERTIONSORT ---------------------------");


            long AA = System.nanoTime();
            MergeSort.sort(Munsorted1);
            AA= System.nanoTime() - AA;

            long BB = System.nanoTime();
            MergeSort.sort(Munsorted2);
            BB= System.nanoTime() - BB;

            long CC = System.nanoTime();
            MergeSort.sort(Munsorted3);
            CC= System.nanoTime() - CC;

            long DD = System.nanoTime();
            MergeSort.sort(Munsorted4);
            DD= System.nanoTime() - DD;

            long EE = System.nanoTime();
            MergeSort.sort(Munsorted5);
            EE= System.nanoTime() - EE;


            long FF = System.nanoTime();
            MergeSort.sort(Munsorted6);
            FF= System.nanoTime() - FF;

            long GG = System.nanoTime();
            MergeSort.sort(Munsorted7);
            GG= System.nanoTime() - GG;

            long HH = System.nanoTime();
            MergeSort.sort(Munsorted8);
            HH= System.nanoTime() - HH;

            long KK = System.nanoTime();
            MergeSort.sort(Munsorted9);
            KK= System.nanoTime() - KK;

            long MM = System.nanoTime();
            MergeSort.sort(Munsorted10);
            MM= System.nanoTime() - MM;

            System.out.println("MergeSort 1.Array " + AA);
            System.out.println("MergeSort 2.Array " + BB);
            System.out.println("MergeSort 3.Array " + CC);
            System.out.println("MergeSort 4.Array " + DD);
            System.out.println("MergeSort 5.Array " + EE);
            System.out.println("MergeSort 6.Array " + FF);
            System.out.println("MergeSort 7.Array " + GG);
            System.out.println("MergeSort 8.Array " + HH);
            System.out.println("MergeSort 9.Array " + KK);
            System.out.println("MergeSort 10.Array " + MM);
            System.out.println(" --------------------- END OF MERGESORT ---------------------------");



            long a = System.nanoTime();
            QuickSort.sort(Qunsorted1);
            a = System.nanoTime() - a;

            long b = System.nanoTime();
            QuickSort.sort(Qunsorted2);
            b = System.nanoTime() - b;

            long c = System.nanoTime();
            QuickSort.sort(Qunsorted3);
            c = System.nanoTime() - c;


            long d = System.nanoTime();
            QuickSort.sort(Qunsorted4);
            d = System.nanoTime() - d;

            long e = System.nanoTime();
            QuickSort.sort(Qunsorted5);
            e = System.nanoTime() - e;

            long f = System.nanoTime();
            QuickSort.sort(Qunsorted6);
            f = System.nanoTime() - f;

            long g = System.nanoTime();
            QuickSort.sort(Qunsorted7);
            g = System.nanoTime() - g;

            long h = System.nanoTime();
            QuickSort.sort(Qunsorted8);
            h = System.nanoTime() - h;

            long k = System.nanoTime();
            QuickSort.sort(Qunsorted9);
            k = System.nanoTime() - k;

            long m = System.nanoTime();
            QuickSort.sort(Qunsorted10);
            m = System.nanoTime() - m;
            System.out.println("QuickSort 1.Array " + a);
            System.out.println("QuickSort 2.Array " + b);
            System.out.println("QuickSort 3.Array " + c);
            System.out.println("QuickSort 4.Array " + d);
            System.out.println("QuickSort 5.Array " + e);
            System.out.println("QuickSort 6.Array " + f);
            System.out.println("QuickSort 7.Array " + g);
            System.out.println("QuickSort 8.Array " + h);
            System.out.println("QuickSort 9.Array " + k);
            System.out.println("QuickSort 10.Array " + m);
            System.out.println(" --------------------- END OF QUİCKSORT ---------------------------");



        }

        {
            DoubleLinkedList<Integer> unsorted1 = new DoubleLinkedList<>();
            DoubleLinkedList<Integer> unsorted2 = new DoubleLinkedList<>();
            DoubleLinkedList<Integer> unsorted3 = new DoubleLinkedList<>();
            DoubleLinkedList<Integer> unsorted4 = new DoubleLinkedList<>();
            DoubleLinkedList<Integer> unsorted5 = new DoubleLinkedList<>();
            DoubleLinkedList<Integer> unsorted6 = new DoubleLinkedList<>();
            DoubleLinkedList<Integer> unsorted7 = new DoubleLinkedList<>();
            DoubleLinkedList<Integer> unsorted8 = new DoubleLinkedList<>();
            DoubleLinkedList<Integer> unsorted9 = new DoubleLinkedList<>();
            DoubleLinkedList<Integer> unsorted10 = new DoubleLinkedList<>();

            MergeDoubleLinkedList merge = new MergeDoubleLinkedList();

            Random rand = new Random();
            for (int i = 0; i < 20; ++i)
                unsorted1.add(rand.nextInt(1000) + 1);
            for (int i = 0; i < 10; ++i)
                unsorted2.add(rand.nextInt(1000) + 1);
            for (int i = 0; i < 5; ++i)
                unsorted3.add(rand.nextInt(1000) + 1);
            for (int i = 0; i < 15; ++i)
                unsorted4.add(rand.nextInt(1000) + 1);
            for (int i = 0; i < 25; ++i)
                unsorted5.add(rand.nextInt(1000) + 1);
            for (int i = 0; i < 45; ++i)
                unsorted6.add(rand.nextInt(1000) + 1);
            for (int i = 0; i < 40; ++i)
                unsorted7.add(rand.nextInt(1000) + 1);
            for (int i = 0; i < 64; ++i)
                unsorted8.add(rand.nextInt(1000) + 1);
            for (int i = 0; i < 8; ++i)
                unsorted9.add(rand.nextInt(1000) + 1);
            for (int i = 0; i < 17; ++i)
                unsorted10.add(rand.nextInt(1000) + 1);


            long a = System.nanoTime();
            merge.sorter(unsorted1);
            a = System.nanoTime() - a;

            long b = System.nanoTime();
            merge.sorter(unsorted2);
            b = System.nanoTime() - b;

            long c = System.nanoTime();
            merge.sorter(unsorted3);
            c = System.nanoTime() - c;


            long d = System.nanoTime();
            merge.sorter(unsorted4);
            d = System.nanoTime() - d;

            long e = System.nanoTime();
            merge.sorter(unsorted5);
            e = System.nanoTime() - e;

            long f = System.nanoTime();
            merge.sorter(unsorted6);
            f = System.nanoTime() - f;

            long g = System.nanoTime();
            merge.sorter(unsorted7);
            g = System.nanoTime() - g;

            long h = System.nanoTime();
            merge.sorter(unsorted8);
            h = System.nanoTime() - h;

            long k = System.nanoTime();
            merge.sorter(unsorted9);
            k = System.nanoTime() - k;

            long m = System.nanoTime();
            merge.sorter(unsorted10);
            m = System.nanoTime() - m;
            System.out.println("MergeDoubleLinked 1.Array " + a);
            System.out.println("MergeDoubleLinked 2.Array " + b);
            System.out.println("MergeDoubleLinked 3.Array " + c);
            System.out.println("MergeDoubleLinked 4.Array " + d);
            System.out.println("MergeDoubleLinked 5.Array " + e);
            System.out.println("MergeDoubleLinked 6.Array " + f);
            System.out.println("MergeDoubleLinked 7.Array " + g);
            System.out.println("MergeDoubleLinked 8.Array " + h);
            System.out.println("MergeDoubleLinked 9.Array " + k);
            System.out.println("MergeDoubleLinked 10.Array " + m);
            System.out.println(" --------------------- END OF DOUBLELİNKEDLİSTMERGE ---------------------------");
        }



        /*
        for(int i=0; i < 20; ++i )
            System.out.println(unsorted1[i]);
        for(int i=0; i < 10; ++i )
            System.out.println(unsorted2[i]);
        for(int i=0; i < 5; ++i )
            System.out.println(unsorted3[i]);
        for(int i=0; i < 15; ++i )
            System.out.println(unsorted4[i]);
        for(int i=0; i < 25; ++i )
            System.out.println(unsorted5[i]);
        for(int i=0; i < 45; ++i )
            System.out.println(unsorted6[i]);
        for(int i=0; i < 40; ++i )
            System.out.println(unsorted7[i]);
        for(int i=0; i < 64; ++i )
            System.out.println(unsorted8[i]);;
        for(int i=0; i < 8; ++i )
            System.out.println(unsorted9[i]);
        for(int i=0; i < 17; ++i )
            System.out.println(unsorted10[i]);
        */



    }


}
