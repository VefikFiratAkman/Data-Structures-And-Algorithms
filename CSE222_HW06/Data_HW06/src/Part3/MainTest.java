package Part3;

import Part2.BinarySearchTree;
import Part2.BinaryTree;
import com.sun.org.apache.xpath.internal.SourceTree;

public class MainTest {

    public void test(){
        {
            BinarySearchTree<Integer> BSTree = new BinarySearchTree<>();


        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /
       20   40  60    */
            BSTree.add(50);
            BSTree.add(30);
            BSTree.add(20);
            BSTree.add(40);
            BSTree.add(70);

            System.out.println(BSTree.toString());
            System.out.println("BinarySearchTree'yi ekrana bastırdım şimdi AVLTree ile check edeceğim.\n");
            AVLTree<Integer> Checker = new AVLTree<>(BSTree);

            System.out.println("Görüldüğü üzere ağaç balanced.\n" +
                    "simdi tekrar balanced olmayan bir binary tree ile deneyeceğim.\n");

        }

        {
            BinarySearchTree<Integer> BSTree = new BinarySearchTree<>();

            BSTree.add(1);
            BSTree.add(2);
            BSTree.add(3);
            BSTree.add(4);
            System.out.println(BSTree.toString());
            System.out.println("BinarySearchTree'yi ekrana bastırdım. Sadece sağa doğru uzamış bir halde.\n" +
                    "simdi AVLTree ile check edeceğim.\n");
            AVLTree<Integer> Checker = new AVLTree<>(BSTree);
            System.out.println("Görüldüğü üzere ağaç balanced değildir.\n");
        }
    }
}
