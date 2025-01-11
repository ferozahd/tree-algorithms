package self.treetute.traversal;

import self.treetute.models.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LevelOrderTreeTraversal {
    private final String EMPTY_STRING ="";
    private Map<Integer,String > maps =new HashMap<>();

    public Map<Integer,String> traversal1(TreeNode root) {
         levelTraversalByLevel(root,1);
         return maps;
    }

    private void levelTraversalByLevel(TreeNode root, int level) {
        if(root==null){
            return ;
        }
        maps.put(level,maps.getOrDefault(level,EMPTY_STRING)+root.getValue());
        levelTraversalByLevel(root.getLeft(),level+1);
        levelTraversalByLevel(root.getRight(),level+1);
    }
}

