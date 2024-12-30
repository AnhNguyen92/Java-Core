package javacore.algorithm.leetcode.under2100;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 2096. Step-By-Step Directions From a Binary Tree Node to Another
 */
public class StepByStepDirectionsFromABinaryTreeNodeToAnother {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lca = lca(root, startValue, destValue);
        List<TreeNode> path1 = getPath(lca, startValue);
        List<TreeNode> path2 = getPath(lca, destValue);
        StringBuilder sb = new StringBuilder();
        sb.append("U".repeat(path1.size() - 1));
        TreeNode prev = path2.get(0);
        TreeNode curr;
        for (int i = 1; i < path2.size(); i++) {
            curr = path2.get(i);
            if (prev.left != null && prev.left.val == curr.val) {
                sb.append("L");
            } else {
                sb.append("R");
            }
            prev = curr;
        }
        return sb.toString();
    }

    private List<TreeNode> getPath(TreeNode root, int p) {
        List<TreeNode> path = new ArrayList<>();
        if (findPath(root, p, path)) {
            return path;
        }
        return null;
    }

    private boolean findPath(TreeNode root, int p, List<TreeNode> path) {
        if (root != null) {
            path.add(root);
            if (root.val == p || findPath(root.left, p, path) || findPath(root.right, p, path)) {
                return true;
            }
            path.remove(path.size() - 1);
        }
        return false;
    }

    private TreeNode lca(TreeNode root, int p, int q) {
        if (root == null || root.val == p || root.val == q) {
            return root;
        }
        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return (left != null) ? left : right;
    }
}
