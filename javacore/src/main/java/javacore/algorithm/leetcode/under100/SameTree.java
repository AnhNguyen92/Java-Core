package javacore.algorithm.leetcode.under100;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leetcode 100
 */

public class SameTree {
	private static final Logger logger = LoggerFactory.getLogger(SameTree.class);

	public static void main(String[] args) {
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		TreeNode p = new TreeNode(2, left, right);
		TreeNode q = new TreeNode(2, left, right);
		logger.info("{}", isSameTree(p, q));
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
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
