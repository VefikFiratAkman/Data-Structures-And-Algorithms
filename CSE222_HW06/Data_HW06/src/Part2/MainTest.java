package Part2;

public class MainTest {

    public void test() {

        {
        BTree<Integer> btree = new BTree<Integer>(3);
        btree.add(10);
        btree.add(20);
        btree.add(30);
        btree.add(40);


        System.out.println(btree.toString());
        System.out.println("Buraya kadar normal bir ağaç oluşturdum." +
                "\nBurdan sonra var olan 3 elemanı eklemeye çalışağım.");
        btree.add(10);
        btree.add(20);
        btree.add(30);
        System.out.println("Aynı 3 elemanı eklemeyi denedim. " +
                "\nEğer eklemediyse yani ağacı yine aynı basarsa" +
                "binarySearch fonksiyonum doğru çalışıyor demektir.");
        System.out.println(btree.toString());
        System.out.println("Görüldüğü üzere ağaclar aynı çıkmıştır." +
                "\nbinarySearch fonksiyonum doğru çalışmaktadır.");
        }
        System.out.println("Aynı seyi simdi farklı elemanlar ile tekrar deneyecegim.");
        {
            BTree<Integer> btree = new BTree<Integer>(3);
            btree.add(1);
            btree.add(2);
            btree.add(3);
            btree.add(4);


            System.out.println(btree.toString());
            System.out.println("Buraya kadar normal bir ağaç oluşturdum." +
                    "\nBurdan sonra var olan 3 elemanı eklemeye çalışağım.");
            btree.add(1);
            btree.add(2);
            btree.add(3);
            System.out.println("Aynı 3 elemanı eklemeyi denedim. " +
                    "\nEğer eklemediyse yani ağacı yine aynı basarsa" +
                    "binarySearch fonksiyonum doğru çalışıyor demektir.");
            System.out.println(btree.toString());
            System.out.println("Görüldüğü üzere ağaclar aynı çıkmıştır." +
                    "\nbinarySearch fonksiyonum doğru çalışmaktadır.");
        }


    }
}
