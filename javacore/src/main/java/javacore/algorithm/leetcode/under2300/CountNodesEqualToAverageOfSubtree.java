package javacore.algorithm.leetcode.under2300;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 2265. Count Nodes Equal to Average of Subtree
 */
public class CountNodesEqualToAverageOfSubtree {
	Map<TreeNode, Integer> sumMap = new HashMap<>();
	Map<TreeNode, Integer> countMap = new HashMap<>();

	public int averageOfSubtree(TreeNode root) {
		int ans = 0;
		if (root != null) {
			int sum = sum(root);
			int count = count(root);
			if (root.val == sum / count)
				ans++;
			if (root.left != null) {
				ans += averageOfSubtree(root.left);
			}
			if (root.right != null) {
				ans += averageOfSubtree(root.right);
			}
		}
		return ans;
	}

	public int sum(TreeNode root) {
		if (root == null)
			return 0;
		if (sumMap.containsKey(root))
			return sumMap.get(root);
		int count = root.val + sum(root.left) + sum(root.right);
		sumMap.put(root, count);
		return count;
	}

	public int count(TreeNode root) {
		if (root == null)
			return 0;
		if (countMap.containsKey(root))
			return countMap.get(root);
		int sum = 1 + count(root.left) + count(root.right);
		countMap.put(root, sum);
		return sum;
	}
}
