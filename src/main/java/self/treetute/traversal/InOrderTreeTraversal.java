/**
 * @Author Feroz Ahmmed
 * Tree traversal algorithm
 * PreOrderTreeTraversal LEFT->ROOT->RIGHT
 */
package self.treetute.traversal;

import self.treetute.models.TreeNode;

public class InOrderTreeTraversal {
    private static final String EMPTY_STRING = "";

    public String traversal1(TreeNode treeNode) {
        return inOrderTraversalByRecursive(treeNode);
    }


    public String inOrderTraversalByRecursive(TreeNode treeNode) {
        if (treeNode == null) {
            return EMPTY_STRING;
        }
        return traversal1(treeNode.getLeft()) +
                treeNode.getValue() + "," +
                traversal1(treeNode.getRight());
    }

}