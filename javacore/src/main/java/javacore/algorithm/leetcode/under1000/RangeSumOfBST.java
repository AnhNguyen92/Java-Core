package javacore.algorithm.leetcode.under1000;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leetcode 938. Range Sum of BST
 */
public class RangeSumOfBST {
	public int rangeSumBST(TreeNode root, int low, int high) {
		if (root == null)
			return 0;

		int result = 0;

		result += rangeSumBST(root.left, low, high);

		if (root.val >= low && root.val <= high)
			result += root.val;

		if (root.val > high)
			return result;

		result += rangeSumBST(root.right, low, high);

		return result;
	}

	public int rangeSumBST1(TreeNode root, int low, int high) {
		int sum = 0;
		if (root != null) {
			if (root.val <= high && root.val >= low) {
				sum += root.val;
			}
			if (root.left != null) {
				sum += rangeSumBST1(root.left, low, high);
			}
			if (root.right != null) {
				sum += rangeSumBST1(root.right, low, high);
			}
		}

		return sum;
	}
}
