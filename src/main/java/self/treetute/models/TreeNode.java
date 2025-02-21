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

    public void setLeft(TreeNode val){
        this.left=val;
    }

    public void setRight(TreeNode val){
        this.right=val;
    }

    @Override
    public String toString(){
        return String.format("{\n\t\"value\":%d, \n\t\"left\":%s, \n\t\"right\":%s\n}",value,left,right);
    }
}
