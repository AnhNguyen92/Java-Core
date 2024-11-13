package javacore.algorithm.leetcode.under0700;

import javacore.algorithm.leetcode.model.TreeNode;

/**
 * 669. Trim a Binary Search Tree
 */
public class TrimABinarySearchTree {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        if (root.val > high || root.val < low) {
            if (root.left != null) {
                return root.left;
            }
            return root.right;
        }
        return root;
    }
}
