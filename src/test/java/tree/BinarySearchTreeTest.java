package tree;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by yesssssss on 2017/8/27.
 */
public class BinarySearchTreeTest {

    private BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();

    @Before
    public void init() {
        bst.insert(1, "1");
        bst.insert(-1, "-1");
        bst.insert(-2, "-2");
        bst.insert(3, "3");
        bst.insert(2, "2");
        bst.insert(10, "10");
        bst.insert(8, "8");
        bst.insert(9, "9");
    }

    @Test
    public void testInsert() {

        bst.middleIter();

        System.out.println("==========");

        bst.rightIter();

        System.out.println("==========");

        bst.leftIter();

    }

    @Test
    public void testPreOrderIterator() {
        bst.preOrderIterator();
        System.out.println("-----");
        bst.leftIter();
    }

    @Test
    public void testPostOrderIterator() {
        bst.postOrderIterator();
        System.out.println("-----");
        bst.rightIter();
    }

    @Test
    public void testMiddleOrderIterator() {
        bst.middleOrderIteator();
        System.out.println("-------");
        bst.middleIter();
    }
}
