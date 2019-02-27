package Part1;

import java.util.Random;

public class MainTest {

    public void test(){


    RedBlackTree<Integer> RBTree = new RedBlackTree<>();
    Integer [] data = new Integer[22];
    RBTreeWorst(data);

        for (int i=0; i<22; ++i) {
        RBTree.add(data[i]);
    }
            System.out.println("Yükseliği en çok node'u en az olduğu durum RedBlackTree için worstCase'dir.\n" +
                    "6 yüksekliğine en az 22 node ile ulaştım.\n");
            System.out.println(RBTree.toString());

}

    public void RBTreeWorst(Integer data[]) {
        Random rand = new Random();

        for (int i = 0; i < 22; ++i) {
            data[i] = rand.nextInt(100) + 1;
        }


        for (int i = 0; i < 22; ++i) {
            for (int k = 0; k < 22; ++k) {
                if (data[i] < data[k]) {
                    int temp = data[i];
                    data[i] = data[k];
                    data[k] = temp;
                }
            }
        }


    }




}
