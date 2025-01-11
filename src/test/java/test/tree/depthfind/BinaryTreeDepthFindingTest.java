package test.tree.depthfind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import self.treetute.depthfind.TreeDepthFinding;
import self.treetute.models.TreeNode;

public class BinaryTreeDepthFindingTest {

    private TreeDepthFinding treeDepthFinding;
    public TreeNode root ;
    @BeforeEach
    public void injectBeforeEach(){
        this.treeDepthFinding=new TreeDepthFinding();
        this.root = new TreeNode(1,

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
    }



    @Test
    public void findTreeDepthByUsingRecursive(){
        Assertions.assertEquals(4,treeDepthFinding.treeDepthFindByUsingRecursive(root));
    }


    @Test
    public void findTreeDepthByUsingNonRecursive(){
        Assertions.assertEquals(4,treeDepthFinding.treeDepthFindByUsingNonRecursive(root));
    }


}
