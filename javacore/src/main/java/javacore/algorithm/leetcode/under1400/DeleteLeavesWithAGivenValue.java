package javacore.algorithm.leetcode.under1400;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1325. Delete Leaves With a Given Value
 */
public class DeleteLeavesWithAGivenValue {
	public TreeNode removeLeafNodes(TreeNode root, int target) {
		if (root != null) {
			root.left = removeLeafNodes(root.left, target);
			root.right = removeLeafNodes(root.right, target);
			if (root.left == null && root.right == null && root.val == target) {
				root = null;
			}
		}
		return root;
	}
}
