package self.treetute;


import self.treetute.models.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


class CompleteBinarySearchTree {
    private TreeNode root;
    private final Queue<TreeNode> queue;  // Keeps track of nodes with missing children

    public CompleteBinarySearchTree() {
        this.root = null;
        this.queue = new LinkedList<>();
    }

    public void insert(int value) {
        TreeNode newNode = new TreeNode(value);

        if (root == null) {
            root = newNode;
            queue.offer(root);
            return;
        }

        while (!queue.isEmpty()) {
            TreeNode current = queue.peek();

            if (current.getLeft() == null) {
                current.setLeft(newNode);
                queue.offer(newNode);
                break;
            } else if (current.getRight() == null) {
                current.setRight(newNode);
                queue.offer(newNode);
                queue.poll();
                break;
            } else {
                queue.poll();
            }
        }
    }


    public void destroy() {
        System.out.println(root.toString());
    }
}


public class Sultana {

    public static void main(String[] args) {

        CompleteBinarySearchTree tree = new CompleteBinarySearchTree();

        for(int i=1; i<200 ; i++){
            tree.insert(i);
        }

        tree.destroy();


    }

}
