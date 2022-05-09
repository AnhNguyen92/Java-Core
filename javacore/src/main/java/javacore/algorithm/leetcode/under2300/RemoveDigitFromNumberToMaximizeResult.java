package javacore.algorithm.leetcode.under2300;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 2259
 */
public class RemoveDigitFromNumberToMaximizeResult {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if ((root.val - p.val) * (root.val - q.val) <= 0) {
			return root;
		}
		if (root.val - q.val > 0) {
			return lowestCommonAncestor(root.left, p, q);
		}
		return lowestCommonAncestor(root.right, p, q);
	}

}
