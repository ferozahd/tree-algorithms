package test.tree.traversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import self.treetute.models.TreeNode;
import self.treetute.traversal.LevelOrderTreeTraversal;

public class LevelOrderTreeTraversalTest {

    private  LevelOrderTreeTraversal levelOrderTreeTraversal;

    @BeforeEach
    public void beforeEverySteps() {
        this.levelOrderTreeTraversal = new LevelOrderTreeTraversal();
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

        var result =levelOrderTreeTraversal.traversal1(root);
        Assertions.assertEquals(result.size(),4);
        Assertions.assertEquals("1",result.get(1));
        Assertions.assertEquals("23",result.get(2));
        Assertions.assertEquals("4567",result.get(3));
        Assertions.assertEquals("891011",result.get(4));


    }
    @Test
    public void test2(){
        var root =new TreeNode(1,new TreeNode(2),new TreeNode(3));
        var result=levelOrderTreeTraversal.traversal1(root);
        Assertions.assertEquals(result.size(),2);
        Assertions.assertEquals("1",result.get(1));
        Assertions.assertEquals("23",result.get(2));
    }

    @Test
    public void test3(){
        var root=new TreeNode(1,new TreeNode(2, new TreeNode(3),null),null);
        var result=levelOrderTreeTraversal.traversal1(root);
        Assertions.assertEquals(result.size(),3);
        Assertions.assertEquals("1",result.get(1));
        Assertions.assertEquals("2",result.get(2));
        Assertions.assertEquals("3",result.get(3));

    }
}
