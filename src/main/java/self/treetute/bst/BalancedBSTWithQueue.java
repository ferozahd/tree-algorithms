package self.treetute.bst;

import self.treetute.models.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BalancedBSTWithQueue {
    private TreeNode root;
    private Queue<TreeNode> queue;


    public BalancedBSTWithQueue() {
        this.queue = new LinkedList<>();
        this.root = null;
    }

    public void insert(int value) {
        TreeNode newNode = new TreeNode(value);

        if (root == null) {
            this.root = newNode;
            this.queue.offer(newNode);
            return;
        }

        while (!queue.isEmpty()) {
            TreeNode priorityNodeToUpdate = queue.peek();

            if (priorityNodeToUpdate.getLeft() == null) {
                priorityNodeToUpdate.setLeft(newNode);
                queue.offer(newNode);
                break;
            } else if (priorityNodeToUpdate.getRight() == null) {
                priorityNodeToUpdate.setRight(newNode);
                queue.offer(newNode);
                queue.poll();
                break;
            } else {
                queue.poll();
            }
        }

    }

    public TreeNode getRoot(){
        return root;
    }




}
