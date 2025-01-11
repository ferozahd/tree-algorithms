package self.treetute.depthfind;

import self.treetute.models.TreeNode;

import java.util.Stack;

public class TreeDepthFinding {
    public int treeDepthFindByUsingRecursive(TreeNode root){
        if(root ==null){
            return 0;
        }

        return 1+Math.max(
                treeDepthFindByUsingRecursive(root.getLeft()),
                treeDepthFindByUsingRecursive(root.getRight())
        );
    }

    public int treeDepthFindByUsingNonRecursive(TreeNode root) {
        if(root==null)
            return 0;

        Stack<TreeNode> stack =new Stack<>();
        int maxLevel =0;
        stack.push(root);
        while(!stack.isEmpty()){
            if(stack.peek().getLeft()!=null){
                stack.push(stack.peek().getLeft());
            }else if(stack.peek().getRight()!=null){
                stack.push(stack.peek().getRight());
            }else{
                maxLevel=Math.max(maxLevel,stack.size());
                stack.pop();
            }
        }

        return maxLevel;
    }
}
