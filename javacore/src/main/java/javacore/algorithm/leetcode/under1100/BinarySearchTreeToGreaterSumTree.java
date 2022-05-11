package javacore.algorithm.leetcode.under1100;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1038
 */
public class BinarySearchTreeToGreaterSumTree {
	int lastValue = 0;

	public TreeNode bstToGst(TreeNode root) {
		TreeNode ans = root;
		sumNode(root);

		return ans;
	}

	private void sumNode(TreeNode root) {
		if (root != null) {
			sumNode(root.right);
			root.val += lastValue;
			lastValue = root.val;
			sumNode(root.left);
		}
	}
}
