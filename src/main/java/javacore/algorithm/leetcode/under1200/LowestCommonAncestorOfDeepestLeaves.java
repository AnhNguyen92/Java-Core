package javacore.algorithm.leetcode.under1200;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.*;

/**
 * 1123. Lowest Common Ancestor of Deepest Leaves
 */
public class LowestCommonAncestorOfDeepestLeaves {
    Map<Integer, List<TreeNode>> levels = new HashMap<>();
    Map<TreeNode, TreeNode> parent = new HashMap<>();
    int max = 0;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        travel(root, 0);
        Set<TreeNode> queue = new HashSet<>(levels.get(max));
        while (queue.size() > 1) {
            int size = queue.size();
            Set<TreeNode> temp = new HashSet<>();
            for (TreeNode node : queue) {
                if (parent.get(node) != null) {
                    temp.add(parent.get(node));
                }
            }
            queue = temp;
        }
        return queue.iterator().next();
    }

    private void travel(TreeNode root, int level) {
        if (root != null) {
            if (max < level) {
                levels = new HashMap<>();
                max = level;
            }
            List<TreeNode> values = levels.getOrDefault(level, new ArrayList<>());
            values.add(root);
            levels.put(level, values);
            if (root.left != null) {
                parent.put(root.left, root);
                travel(root.left, level + 1);
            }
            if (root.right != null) {
                parent.put(root.right, root);
                travel(root.right, level + 1);
            }
        }
    }
}
