package Q3;

import java.util.LinkedList;
import java.util.List;
/**
 * Q3 sorusu icin MainTest yapilmasini saglayan
 * yardimci classdir.
 */
public class MainTest {

    public void test(){
        DoubleLinkedList<String> list = new DoubleLinkedList<String>();
        MergeDoubleLinkedList merge = new MergeDoubleLinkedList();

        list.add("var");
        list.add("inekleri");
        list.add("ciftliginde");
        list.add("baba'nin");
        list.add("ali");




        list.print();


        System.out.println("******************");

        DoubleLinkedList<String> sorted = merge.sorter(list);
        sorted.print();



    }

}
