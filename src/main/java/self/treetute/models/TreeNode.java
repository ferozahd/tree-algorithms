package self.treetute.models;

public class TreeNode {
    private final int value;
    private TreeNode left;
    private TreeNode right;

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

    public void setLeft(int val){
        this.left=new TreeNode(val);
    }

    public void setRight(int val){
        this.right=new TreeNode(val);
    }

}
