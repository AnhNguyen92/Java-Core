package javacore.algorithm.leetcode.under0900;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 863. All Nodes Distance K in Binary Tree
 */
public class AllNodesDistanceKInBinaryTree {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if (k == 0) {
            ans.add(target.val);
            return ans;
        }
        List<TreeNode> lst = new ArrayList<>();
        travel(lst, root);
        for (TreeNode node : lst) {
            if (node != target && findPathLength(root, target, node) == k)
                ans.add(node.val);
        }
        return ans;
    }

    private void travel(List<TreeNode> lst, TreeNode root) {
        if (root != null) {
            lst.add(root);
            travel(lst, root.left);
            travel(lst, root.right);
        }
    }

    public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        TreeNode leftLCA = findLCA(root.left, p, q);
        TreeNode rightLCA = findLCA(root.right, p, q);
        if (leftLCA != null && rightLCA != null) {
            return root;
        }
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public int findDistance(TreeNode root, TreeNode target, int distance) {
        if (root == null) {
            return -1;
        }
        if (root.val == target.val) {
            return distance;
        }

        int leftDistance = findDistance(root.left, target, distance + 1);
        if (leftDistance != -1) {
            return leftDistance; // Target found in left subtree
        }

        return findDistance(root.right, target, distance + 1); // Search in the right subtree
    }

    public int findPathLength(TreeNode root, TreeNode a, TreeNode b) {
        TreeNode lca = findLCA(root, a, b);
        int distanceA = findDistance(lca, a, 0);
        int distanceB = findDistance(lca, b, 0);
        return distanceA + distanceB;
    }
}
