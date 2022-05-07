package javacore.algorithm.leetcode.under0200;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 111
 */
public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
		return minDepthRecur(root, 0);
	}

	public int minDepthRecur(TreeNode root, int depth) {
		if (root == null)
			return depth;
		depth++;
		if (root.left == null)
			return minDepthRecur(root.right, depth);
		if (root.left == null || root.right == null)
			return minDepthRecur(root.left, depth);

		return Math.min(minDepthRecur(root.left, depth), minDepthRecur(root.right, depth));
	}
}
