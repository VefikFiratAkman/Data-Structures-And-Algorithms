package com.company;



/**
 * Main Test class for BinaryTreeExtend class.
 */

public class mainTest {

    public void testFunc(){


        BinaryTreeExtend obje = new BinaryTreeExtend();
        BinaryTreeExtend binary1 = new BinaryTreeExtend();
        BinaryTreeExtend binary2 = new BinaryTreeExtend();
        String sb = new String();



        System.out.println("=====================================================");
        System.out.println("Tree boşken search fonksiyonu çağırdım.");


        sb = binary1.preOrderTraverse();
        System.out.println(sb);

        System.out.println("=====================================================");
        System.out.println("Moodle da paylaşılan expendition örneğini kullandım: ");

        try {
        obje.add(null,1);
        obje.add(1,2);
        obje.add(1,4);
        obje.add(1,7);
        obje.add(2,3);
        obje.add(2,6);
        obje.add(3,5);

        sb = obje.preOrderTraverse();
        System.out.println(sb);

        System.out.println("=====================================================");
        System.out.println("Rapor da birinci görsel de ki tree'yi kullandım. ");

        binary1.add(null,"A");
        binary1.add("A","B");
        binary1.add("A","C");

        binary1.add("A","D");
        binary1.add("A","E");
        binary1.add("D","F");
        binary1.add("D","G");
        binary1.add("E","H");
        binary1.add("G","I");
        binary1.add("G","J");


        sb = binary1.preOrderTraverse();
        System.out.println(sb);

        System.out.println("=====================================================");
        System.out.println("Rapor da ikinci görsel de ki tree'yi kullandım. ");

        binary2.add(null,"CEO");
        binary2.add("CEO","Production Manager");
        binary2.add("CEO","Personal Manager");
        binary2.add("CEO","Sales Manager");
        binary2.add("Production Manager","Purchasing Supervisor");
        binary2.add("Production Manager","Warehouse Supervisor");
        binary2.add("Sales Manager","Shipping Supervisor");

        sb = binary2.preOrderTraverse();
        System.out.println(sb);

        System.out.println("=====================================================");
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
