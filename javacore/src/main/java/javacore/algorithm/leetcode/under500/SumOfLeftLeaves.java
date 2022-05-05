package javacore.algorithm.leetcode.under500;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 404
*/
public class SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null)
			return 0;
		int sum = 0;
		if (root.left != null && root.left.left == null && root.left.right == null)
			sum += root.left.val;
		return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
	}
}
