package javacore.algorithm.leetcode.under0100;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 100. Same Tree
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
