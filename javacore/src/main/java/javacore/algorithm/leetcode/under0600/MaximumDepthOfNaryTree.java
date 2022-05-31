package javacore.algorithm.leetcode.under0600;

import javacore.algorithm.leetcode.model.Node1;

/*
 * LeetCode 559
 */
public class MaximumDepthOfNaryTree {
	int sum = 0;

	public int maxDepth(Node1 root) {
		if (root != null) {
			sum = 1;
			helper(root, sum);
		}
		return sum;
	}

	public void helper(Node1 root, int maxindepth) {
		if (root == null)
			return;
		if (sum < maxindepth) {
			sum = maxindepth;
		}
		;
		for (Node1 a : root.children) {
			helper(a, maxindepth + 1);
		}
	}
}
