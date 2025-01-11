package test.tree.traversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import self.treetute.models.TreeNode;
import self.treetute.traversal.InOrderTreeTraversal;

public class InOrderTreeTraversalTest {


    private final InOrderTreeTraversal inOrderTreeTraversal;

    public InOrderTreeTraversalTest() {
        this.inOrderTreeTraversal = new InOrderTreeTraversal();
    }


    @Test
    void test1() {
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

        Assertions.assertEquals("8,4,9,2,10,5,11,1,6,3,7,",inOrderTreeTraversal.traversal1(root));

        var root2 =new TreeNode(1,new TreeNode(2),new TreeNode(3));
        Assertions.assertEquals("2,1,3,",inOrderTreeTraversal.traversal1(root2));

        var root3=new TreeNode(1,new TreeNode(2, new TreeNode(3),null),null);
        Assertions.assertEquals("3,2,1,",inOrderTreeTraversal.traversal1(root3));


    }
}
