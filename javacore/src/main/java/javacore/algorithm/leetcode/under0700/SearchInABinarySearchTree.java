package javacore.algorithm.leetcode.under0700;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 700. Search in a Binary Search Tree
 */
public class SearchInABinarySearchTree {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null)
			return null;
		if (root.val == val)
			return root;
		TreeNode res = searchBST(root.left, val);
		if (res == null)
			return searchBST(root.right, val);
		return res;
	}
}
