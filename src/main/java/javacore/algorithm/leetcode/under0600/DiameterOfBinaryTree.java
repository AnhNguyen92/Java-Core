package javacore.algorithm.leetcode.under0600;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 543. Diameter of Binary Tree
 */
public class DiameterOfBinaryTree {
	public int height(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}

	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null)
			return 0;
		int l = height(root.left);
		int r = height(root.right);
		return Math.max(l + r, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
	}
}
