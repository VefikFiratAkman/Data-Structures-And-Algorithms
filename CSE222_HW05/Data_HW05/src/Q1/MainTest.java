package Q1;

/**
 * Q1 sorusu icin MainTest yapilmasini saglayan
 * yardimci classdir.
 */
public class MainTest {

    public void test(){

        DoubleHash<Integer,String> myDoubleHash = new DoubleHash<>();
        myDoubleHash.put(0,"Key 0 - Input Order = 1");
        myDoubleHash.put(5,"Key 5 - Input Order = 2");
        myDoubleHash.put(14,"Key 14 - Input Order = 3");
        myDoubleHash.put(16,"Key 16 - Input Order = 4");
        myDoubleHash.put(2,"Key 2 - Input Order = 5");
        myDoubleHash.put(17,"Key 17 - Input Order = 6");
        myDoubleHash.put(11,"Key 11 - Input Order = 7");
        myDoubleHash.put(21,"Key 21 - Input Order = 8");
        myDoubleHash.put(3,"Key 3 - Input Order = 9");
        System.out.println("Capacity is: " + myDoubleHash.capacity);
        for(int i=0; i < myDoubleHash.capacity;++i) {
            System.out.println("[" + i + "] " + myDoubleHash.hashTable[i]);
        }
        System.out.println("Capacity is: " + myDoubleHash.capacity);


        System.out.println("------------------------- TEST 2 -------------------------");


        DoubleHash<Integer,String> myDoubleHash2 = new DoubleHash<>();
        myDoubleHash2.put(0,"Key 0 - Input Order = 1");
        myDoubleHash2.put(2,"Key 3 - Input Order = 2");
        myDoubleHash2.put(5,"Key 5 - Input Order = 3");
        myDoubleHash2.put(14,"Key 14 - Input Order = 4");
        myDoubleHash2.put(17,"Key 17 - Input Order = 5");
        myDoubleHash2.put(21,"Key 21 - Input Order = 6");
        myDoubleHash2.put(32,"Key 32 - Input Order = 7");
        myDoubleHash2.put(45,"Key 45 - Input Order = 8");
        myDoubleHash2.put(52,"Key 52 - Input Order = 9");
        myDoubleHash2.put(64,"Key 64 - Input Order = 10");
        myDoubleHash2.put(71,"Key 71 - Input Order = 11");
        System.out.println("Capacity is: " + myDoubleHash2.capacity);
        for(int i=0; i < myDoubleHash2.capacity;++i) {
            System.out.println("[" + i + "] " + myDoubleHash2.hashTable[i]);
        }
        System.out.println("Capacity is: " + myDoubleHash2.capacity);

    }


}
