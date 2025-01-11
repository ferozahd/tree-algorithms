package self.treetute.depthfind;

import self.treetute.models.TreeNode;

import java.util.Stack;

public class BinaryTreeNodeCounting {
    public int treeDepthFindByUsingRecursive(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+treeDepthFindByUsingRecursive(root.getLeft())
                +treeDepthFindByUsingRecursive(root.getRight());
    }

    public int treeDepthFindByUsingNonRecursive(TreeNode root) {
        if(root==null){
            return 0;
        }
        Stack<TreeNode> stack =new Stack<>();
        TreeNode current =root;
        int nodes=0;
        while (current!=null || !stack.empty()){
            while (current!=null){
                stack.add(current);
                current=current.getLeft();
                nodes++;
            }

            current=stack.pop();
            current=current.getRight();

        }

        return nodes;
    }
}
