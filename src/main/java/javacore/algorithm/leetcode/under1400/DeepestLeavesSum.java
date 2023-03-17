package javacore.algorithm.leetcode.under1400;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1302. Deepest Leaves Sum
 */
public class DeepestLeavesSum {
	class SumLevel {
		private int sum;
		private int highestLevel;

		SumLevel(int sum, int hl) {
			this.sum = sum;
			this.highestLevel = hl;
		}

		int getLevel() {
			return this.highestLevel;
		}

		int getSum() {
			return this.sum;
		}
	}

	public int deepestLeavesSum(TreeNode root) {
		SumLevel ans = getSum(root, 0);
		return ans.getSum();
	}

	public SumLevel getSum(TreeNode node, int level) {
		if (node == null) {
			return new SumLevel(0, -1);
		}
		if (node.right == null && node.left == null) {
			return new SumLevel(node.val, level);
		}
		SumLevel left = getSum(node.left, level + 1);
		SumLevel right = getSum(node.right, level + 1);

		if (left.getLevel() == right.getLevel()) {
			return new SumLevel(left.getSum() + right.getSum(), right.getLevel());
		} else if (left.getLevel() > right.getLevel()) {
			return new SumLevel(left.getSum(), left.getLevel());
		} else {
			return new SumLevel(right.getSum(), right.getLevel());
		}
	}
}
