package javacore.algorithm.leetcode.under1200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leetcode 1161. Maximum Level Sum of a Binary Tree
 */
public class MaximumLevelSumOfABinaryTree {
	public int maxLevelSum(TreeNode root) {
		List<Integer> lst = new ArrayList<>();
		travel(lst, root, 0);
		int max = 0;
		for (int i = 1; i < lst.size(); i++) {
			if (lst.get(i) > lst.get(max)) {
				max = i;
			}
		}
		return max + 1;
	}

	private void travel(List<Integer> lst, TreeNode root, int depth) {
		if (root != null) {
			if (depth == lst.size()) {
				lst.add(0);
			}
			lst.set(depth, lst.get(depth) + root.val);
			travel(lst, root.left, depth + 1);
			travel(lst, root.right, depth + 1);
		}
	}
}
