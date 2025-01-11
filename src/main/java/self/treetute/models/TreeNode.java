package self.treetute.models;

public class TreeNode {
    private final int value;
    private final TreeNode left;
    private final TreeNode right;

    public TreeNode(int value,TreeNode left, TreeNode right){
        this.value=value;
        this.left=left;
        this.right=right;
    }
    public TreeNode(int value){
        this(value,null,null);
    }


    public int getValue() {
        return value;
    }


    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

}
