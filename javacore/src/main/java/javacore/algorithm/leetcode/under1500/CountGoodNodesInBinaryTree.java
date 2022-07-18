package javacore.algorithm.leetcode.under1500;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1448
 */
public class CountGoodNodesInBinaryTree {
	int count = 0;

	public int goodNodes(TreeNode root) {
		int max = root.val;
		travel(root, max);
		return count;
	}

	private void travel(TreeNode root, int max) {
		if (root != null) {
			if (root.val >= max) {
				count++;
				max = root.val;
			}
			travel(root.left, max);
			travel(root.right, max);
		}
	}
}
