package self.treetute.traversal;

import self.treetute.models.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class TreeZigzagTraversalLevelOrder {
    private Map<Integer, String> maps = new HashMap<>();
    private static final String EMPTY_STRING = "";

    public Map<Integer, String> traversal1(TreeNode root) {
        recursiveTreeTraversalZigZag(root, 1);
        return maps;
    }

    private void recursiveTreeTraversalZigZag(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (level % 2 == 1) {
            maps.put(level, maps.getOrDefault(level, EMPTY_STRING) + root.getValue());
        } else {
            maps.put(level, root.getValue() + maps.getOrDefault(level, EMPTY_STRING));
        }

        recursiveTreeTraversalZigZag(root.getLeft(), level + 1);
        recursiveTreeTraversalZigZag(root.getRight(), level + 1);
    }
}
