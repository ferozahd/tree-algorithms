package self.treetute.traversal;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString(){
        return Integer.toString(val);
    }
}

public class MirrorTraversalTree {

    public  String morrisInOrder(TreeNode root) {
        TreeNode current = root;
        StringBuilder sb =new StringBuilder();
        while (current != null) {
            // If left child is null, visit this node and move to the right
            if (current.left == null) {
                sb.append(current.val + ",");
                current = current.right;
            } else {
                // Find the in-order predecessor of current
                TreeNode predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                // Make the temporary link or break it
                if (predecessor.right == null) {
                    // Create the temporary link
                    predecessor.right = current;
                    current = current.left;
                } else {
                    // Temporary link already exists; remove it and visit current
                    predecessor.right = null;
                    sb.append(current.val + ",");
                    current = current.right;
                }
            }
        }

        return sb.toString();
    }


}
