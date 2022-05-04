package javacore.algorithm.leetcode.under200;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 110
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		int lh = height(root.left);
		int rh = height(root.right);
		return (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right));
	}

	private int height(TreeNode root) {
		return (root == null) ? 0 : (1 + max(height(root.left), height(root.right)));
	}

	private int max(int a, int b) {
		return (a >= b) ? a : b;
	}
}
