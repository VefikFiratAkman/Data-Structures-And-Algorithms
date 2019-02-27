package com.company;

import java.io.IOException;
import java.util.LinkedList;

public class maintest {

    public void mainTest(){
        LinkedList<Course> getCodeList = new LinkedList<>();
        LinkedList<Course> getRangeList = new LinkedList<>();
        LinkedList<Course> semesterList = new LinkedList<>();

        /* Part1 */
        System.out.println("- PART 1 - - PART 1 - - PART 1 - - PART 1 - - PART 1 - - PART 1 -");
        System.out.println("- PART 1 - - PART 1 - - PART 1 - - PART 1 - - PART 1 - - PART 1 -");
        System.out.println("- PART 1 - - PART 1 - - PART 1 - - PART 1 - - PART 1 - - PART 1 -");

        try {
            cseCourse first = new cseCourse();
            getCodeList = first.getByCode("CSE 107");
            getRangeList = first.getByRange(10,14);
            semesterList = first.listSemesterCourses(7);
        } catch (IOException e) {
            System.out.println("Dosyayla ilgili sorun var. Dosya aciksa kapayiniz.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("==================================================================");
        System.out.println("Print semesterList: (Semester is 7)");
        System.out.println("------------------------------------------------------------------");
        for (Course aExtended : semesterList) {
            System.out.println(aExtended);
        }
        System.out.println("==================================================================");




        /* Part1 */



        /* Part2 */
        System.out.println("\n\n\n- PART 2 - - PART 2 - - PART 2 - - PART 2 - - PART 2 - - PART 2 -");
        System.out.println("- PART 2 - - PART 2 - - PART 2 - - PART 2 - - PART 2 - - PART 2 -");
        System.out.println("- PART 2 - - PART 2 - - PART 2 - - PART 2 - - PART 2 - - PART 2 -");


        LinkedListExtension<Course> extendedList = new LinkedListExtension<Course>();
        extendedList.addAll(getRangeList); /* Part2 için part1'rin methodu ile part2 için test listesi oluşturdum.
        Listenin sadece 5 elemanı var.*/



        System.out.println("==================================================================");
        System.out.println("First Print All List: (Just Have 5 element)");
        System.out.println("------------------------------------------------------------------");

        for (Course aExtended : extendedList) {
            System.out.println(aExtended);
        }

        System.out.println("==================================================================");
        System.out.println("I disabled 2 times index 1. Because first time I remove index 1," +
                "index 2 become index 1");
        System.out.println("And first, i took object which i will disabled. (Course dis1,dis2 variable) ");


        Course dis1 = extendedList.get(1);
        extendedList.disable(1);

        Course dis2 = extendedList.get(1);
        extendedList.disable(1);
        System.out.println("==================================================================");
        System.out.println("After the remove index 1 and 2 ( Actually index 1, index 1)");
        System.out.println("------------------------------------------------------------------");

        for (Course aExtended : extendedList) {
            System.out.println(aExtended);
        }
        System.out.println("==================================================================");
        System.out.println("Show Disable Member: (Used showDisabled Method)");
        extendedList.showDisabled();
        System.out.println("==================================================================");
        System.out.println("Now I enabled with enable method. (Used enable(dis2),enable(dis1))\n" +
                "Note:İf you want you can change of order. İt will work correctly. ");

        extendedList.enable(dis2);
        extendedList.enable(dis1);
        System.out.println("==================================================================");
        System.out.println("Now I print all list again. And you can see all member with correct order.");
        System.out.println("------------------------------------------------------------------");

        for (Course aExtended : extendedList) {
            System.out.println(aExtended);
        }
        System.out.println("==================================================================");

        /* Part2 */


        System.out.println("\n\n\n- PART 3 - - PART 3 - - PART 3 - - PART 3 - - PART 3 - - PART 3 -");
        System.out.println("- PART 3 - - PART 3 - - PART 3 - - PART 3 - - PART 3 - - PART 3 -");
        System.out.println("- PART 3 - - PART 3 - - PART 3 - - PART 3 - - PART 3 - - PART 3 -");


        System.out.println("==================================================================");

        /* Part3 */
        try {
            MyLinkedList pof = new MyLinkedList();
            for (int i = 0; i < getRangeList.size(); ++i) {
                pof.add(getRangeList.get(i));
            }
            for (int i = 0; i <getRangeList.size() ; ++i) {
                System.out.println(pof.get(i));
            }
            pof.connecter();
            System.out.println("==================================================================");
            int i = 0;
            while(i<getRangeList.size()) {
                System.out.println(pof.nextInSemester());
                ++i;
                System.out.println("//nextInSemester Methodu İle Basıldı\n");
            }


        }
        catch (Exception e){
            e.getMessage();
            e.getStackTrace();
        }
        /* Part3 */



    }


}
