package self.treetute.traversal;

import self.treetute.models.TreeNode;

public class MirrorTraversalTree {

    public  String morrisInOrder(TreeNode root) {
        TreeNode current = root;
        StringBuilder sb =new StringBuilder();
        while (current != null) {
            // If left child is null, visit this node and move to the right
            if (current.getLeft() == null) {
                sb.append(current.getValue() + ",");
                current = current.getRight();
            } else {
                // Find the in-order predecessor of current
                TreeNode predecessor = current.getLeft();
                while (predecessor.getRight() != null && predecessor.getRight() != current) {
                    predecessor = predecessor.getRight();
                }

                // Make the temporary link or break it
                if (predecessor.getRight() == null) {
                    // Create the temporary link
                    predecessor.setRight( current);
                    current = current.getLeft();
                } else {
                    // Temporary link already exists; remove it and visit current
                    predecessor.setRight(null);
                    sb.append(current.getValue() + ",");
                    current = current.getRight();
                }
            }
        }

        return sb.toString();
    }


}
