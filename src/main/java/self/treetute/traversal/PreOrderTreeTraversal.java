/**
 * @Author Feroz Ahmmed
 * Tree traversal algorithm
 * PreOrderTreeTraversal ROOT->LEFT->RIGHT
 */

package self.treetute.traversal;

import self.treetute.models.TreeNode;

public class PreOrderTreeTraversal {
    private static final String EMPTY_STRING = "";

    public String traversal1(TreeNode treeNode) {
        return inOrderTraversalByRecursive(treeNode);
    }


    public String inOrderTraversalByRecursive(TreeNode treeNode){
        if (treeNode == null) {
            return EMPTY_STRING;
        }
        return treeNode.getValue() +","+
                traversal1(treeNode.getLeft()) +
                traversal1(treeNode.getRight());
    }


}
