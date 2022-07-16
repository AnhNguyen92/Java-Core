package javacore.algorithm.leetcode.under0600;

import javacore.algorithm.leetcode.model.NodeList;

/*
 * LeetCode 559
 */
public class MaximumDepthOfNaryTree {
	int sum = 0;

	public int maxDepth(NodeList root) {
		if (root != null) {
			sum = 1;
			helper(root, sum);
		}
		return sum;
	}

	public void helper(NodeList root, int maxindepth) {
		if (root == null)
			return;
		if (sum < maxindepth) {
			sum = maxindepth;
		}
		;
		for (NodeList a : root.children) {
			helper(a, maxindepth + 1);
		}
	}
}
