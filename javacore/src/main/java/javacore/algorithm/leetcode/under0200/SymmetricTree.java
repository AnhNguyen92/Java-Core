package javacore.algorithm.leetcode.under0200;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 *  Leetcode 101. Symmetric Tree
 */
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isSymmetricCompare(root.left, root.right);
	}

	public boolean isSymmetricCompare(TreeNode leftNode, TreeNode rightNode) {
		if (leftNode == null && rightNode == null)
			return true;
		if (leftNode == null || rightNode == null)
			return false;
		if (leftNode.val != rightNode.val)
			return false;
		return isSymmetricCompare(leftNode.left, rightNode.right) && isSymmetricCompare(leftNode.right, rightNode.left);
	}
}
