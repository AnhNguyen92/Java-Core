package javacore.algorithm.leetcode.under1400;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1315. Sum of Nodes with Even-Valued Grandparent
 */
public class SumOfNodesWithEvenValuedGrandparent {
	int sum = 0;

	public int sumEvenGrandparent(TreeNode root) {
		if (root != null) {
			sumValue(root, 0);
		}
		return sum;
	}

	private void sumValue(TreeNode root, int order) {
		if (root != null) {
			if (order == 1) {
				if (root.left != null)
					sum += root.left.val;
				if (root.right != null)
					sum += root.right.val;
			}
			if (root.val % 2 == 0) {
				sumValue(root.left, 1);
				sumValue(root.right, 1);
			} else {
				sumValue(root.left, 0);
				sumValue(root.right, 0);
			}
		}
	}
}
