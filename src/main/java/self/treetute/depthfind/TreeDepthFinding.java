package self.treetute.depthfind;

import self.treetute.models.TreeNode;

import java.util.Stack;

public class TreeDepthFinding {
    public int treeDepthFindByUsingRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(
                treeDepthFindByUsingRecursive(root.getLeft()),
                treeDepthFindByUsingRecursive(root.getRight())
        );
    }

    public int treeDepthFindByUsingNonRecursive(TreeNode root) {
        if (root == null)
            return 0;

        Stack<TreeNode> stack = new Stack<>();
        int maxLevel = 0;
        stack.push(root);
        boolean left = true;
        while (!stack.isEmpty()) {
            if (stack.peek().getLeft() != null) {
                stack.push(stack.peek().getLeft());
                left = true;
            } else if (stack.peek().getRight() != null) {
                stack.push(stack.peek().getRight());
                left = false;
            } else {
                maxLevel = Math.max(maxLevel, stack.size());
                stack.pop();


                TreeNode backTree = stack.pop();
                if (left) {
                    backTree.setLeft(null);
                } else {
                    backTree.setRight(null);
                }
                if (backTree.getLeft() != null || backTree.getRight() != null) {
                    stack.add(backTree);
                }

            }
        }

        return maxLevel;
    }

    public int treeDepthFindByUsingNonRecursive2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxDepth = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Traverse to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }

            // Pop the node, visit it, and move to the right
            maxDepth = Math.max(maxDepth, stack.size());
            current = stack.pop();
            current = current.getRight();
        }
        return maxDepth;
    }

}
