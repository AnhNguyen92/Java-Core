package javacore.algorithm.leetcode.under0800;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 701. Insert into a Binary Search Tree
 */
public class InsertIntoABinarySearchTree {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null)
			root = new TreeNode(val);
		else {
			insert(root, val);
		}
		return root;
	}

	private void insert(TreeNode root, int val) {
		if (root != null) {
			if (root.val < val) {
				if (root.right == null)
					root.right = new TreeNode(val);
				else
					insert(root.right, val);
			} else {
				if (root.left == null)
					root.left = new TreeNode(val);
				else
					insert(root.left, val);
			}
		}
	}
}
