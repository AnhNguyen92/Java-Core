package javacore.algorithm.leetcode.under1000;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 965. Univalued Binary Tree
 */
public class UnivaluedBinaryTree {
	public boolean isUnivalTree(TreeNode root) {
		int target = root.val;
		return isUnivalTree(root, target);
	}

	private boolean isUnivalTree(TreeNode root, int target) {
		if (root == null)
			return true;
		return (root.val == target) && isUnivalTree(root.right, target) && isUnivalTree(root.left, target);
	}
}
