
package test.tree.traversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import self.treetute.models.TreeNode;
import self.treetute.traversal.PreOrderTreeTraversal;

public class PreOrderTreeTraversalTest {

    private final PreOrderTreeTraversal preOrderTreeTraversal;

    public PreOrderTreeTraversalTest(){
        preOrderTreeTraversal=new PreOrderTreeTraversal();
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

        Assertions.assertEquals("1,2,4,8,9,5,10,11,3,6,7,",preOrderTreeTraversal.traversal1(root));

        var root2 =new TreeNode(1,new TreeNode(2),new TreeNode(3));
        Assertions.assertEquals("1,2,3,",preOrderTreeTraversal.traversal1(root2));

        var root3=new TreeNode(1,new TreeNode(2, new TreeNode(3),null),null);
        Assertions.assertEquals("1,2,3,",preOrderTreeTraversal.traversal1(root3));


    }


}
