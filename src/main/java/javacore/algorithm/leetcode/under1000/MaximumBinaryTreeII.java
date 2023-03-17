package javacore.algorithm.leetcode.under1000;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 998. Maximum Binary Tree II
 */
public class MaximumBinaryTreeII {
	public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val < val) {
            return new TreeNode(val, root, null);
        }
        root.right = insertIntoMaxTree(root.right, val);
        return root;
    }
}
