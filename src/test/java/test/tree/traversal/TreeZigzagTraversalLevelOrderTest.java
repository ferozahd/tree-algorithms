package test.tree.traversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import self.treetute.models.TreeNode;
import self.treetute.traversal.TreeZigzagTraversalLevelOrder;

public class TreeZigzagTraversalLevelOrderTest {
    private TreeZigzagTraversalLevelOrder treeZigzagTraversalLevelOrder;


    @BeforeEach
    public void beforeEach(){
      treeZigzagTraversalLevelOrder=new TreeZigzagTraversalLevelOrder();
    }


    @Test
    public void test1(){
        var root = new TreeNode(1,

                new TreeNode(2,

                        new TreeNode(4,
                                new TreeNode(8),
                                new TreeNode(9)),

                        new TreeNode(5,
                                new TreeNode(10),
                                new TreeNode(11))
                ),


                new TreeNode(3,
                        new TreeNode(6),
                        new TreeNode(7))
        );


        var result =treeZigzagTraversalLevelOrder.traversal1(root);
        System.out.println(result);
        Assertions.assertEquals(result.size(),4);
        Assertions.assertEquals("1",result.get(1));
        Assertions.assertEquals("32",result.get(2));
        Assertions.assertEquals("4567",result.get(3));
        Assertions.assertEquals("111098",result.get(4));
    }

}
