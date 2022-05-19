package javacore.algorithm.leetcode.under0100;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leetcode 100
 */

public class SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		if (p.val != q.val)
			return false;
		if (isSameTree(p.left, q.left)) {
			return isSameTree(p.right, q.right);
		}
		return false;
	}

}
