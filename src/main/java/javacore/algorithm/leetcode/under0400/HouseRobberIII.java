package javacore.algorithm.leetcode.under0400;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 337. House Robber III
 */
public class HouseRobberIII {
	Map<TreeNode, Integer> dp = new HashMap<>();

	public int rob(TreeNode root) {
		return traverse(root);
	}

	int traverse(TreeNode root) {
		if (root == null)
			return 0;
		if (dp.containsKey(root)) {
			return dp.get(root);
		}
		int val = 0;
		if (root.left != null) {
			val += traverse(root.left.left) + traverse(root.left.right);
		}
		if (root.right != null) {
			val += traverse(root.right.left) + traverse(root.right.right);
		}

		int cur = Math.max(val + root.val, traverse(root.left) + traverse(root.right));
		dp.put(root, cur);
		
		return cur;
	}
}
