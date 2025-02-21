package self.treetute.bst;

import self.treetute.models.TreeNode;


public class BalancedBSTDirectionMap {
    private TreeNode root;
    private long size;


    public BalancedBSTDirectionMap() {
        this.size = 0;
        this.root = null;
    }

    public void insert(int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            this.root = newNode;
            size++;
            return;
        }


        TreeNode secondaryRoot = null;
        for (boolean directory : getDirectionMap(size)) {
            if (secondaryRoot == null) {
                secondaryRoot = root;
                continue;
            }
            //Shift cursor to left
            if (!directory) {
                if (secondaryRoot.getLeft() == null) {
                    secondaryRoot.setLeft(new TreeNode(value));
                    size++;
                }
                secondaryRoot = secondaryRoot.getLeft();
                continue;
            }
            //Shift cursor to right
            if (secondaryRoot.getRight() == null) {
                secondaryRoot.setRight(new TreeNode(value));
                size++;
            }
            secondaryRoot = secondaryRoot.getRight();
        }


    }
    private boolean[] getDirectionMap(long size) {
        long value = size + 1;
        int numBits = Long.SIZE - Long.numberOfLeadingZeros(value);
        boolean[] directionMap = new boolean[numBits];

        for (int i = numBits - 1; i >= 0; i--) {
            directionMap[i] = (value & 1) == 1;
            value >>= 1;
        }

        return directionMap;
    }



    public TreeNode getRoot() {
        return root;
    }


}
