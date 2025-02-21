package test.tree.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import self.treetute.bst.BalancedBSTDirectionMap;
import self.treetute.bst.BalancedBSTWithQueue;
import self.treetute.models.TreeNode;
import self.treetute.traversal.InOrderTreeTraversal;

public class BalancedBSTTest {

    private final InOrderTreeTraversal inOrderTreeTraversal;
    private   BalancedBSTWithQueue balancedBSTWithQueue;
    private BalancedBSTDirectionMap balancedBSTDirectionMap;
    public BalancedBSTTest() {
        this.inOrderTreeTraversal = new InOrderTreeTraversal();
    }


    @BeforeEach
    public void setupEachTestCase(){
        this.balancedBSTWithQueue=new BalancedBSTWithQueue();
        this.balancedBSTDirectionMap=new BalancedBSTDirectionMap();
    }


    @Test
    public void checkBalanced(){
        for(int i=0 ; i<50; i++) {
            this.balancedBSTWithQueue.insert(i);
        }
        Assertions.assertTrue(isBalanced(this.balancedBSTWithQueue.getRoot()));
    }


    @Test
    public void checkBalancedWithDirection(){
        for(int i=0 ; i<50; i++) {
            this.balancedBSTDirectionMap.insert(i);
        }
        Assertions.assertTrue(isBalanced(this.balancedBSTDirectionMap.getRoot()));
    }



    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    // Helper method to compute height and check balance
    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.getLeft());
        if (leftHeight == -1) return -1;  // Left subtree unbalanced

        int rightHeight = checkHeight(node.getRight());
        if (rightHeight == -1) return -1; // Right subtree unbalanced

        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // Current node unbalanced

        return Math.max(leftHeight, rightHeight) + 1; // Return height if balanced
    }


}
