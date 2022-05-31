package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 113
 */
public class PathSumII {
	List<List<Integer>> ans = new ArrayList<>();

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		sum(root, new ArrayList<>(), 0, targetSum);
		return new ArrayList<>(ans);
	}

	public void sum(TreeNode root, List<Integer> lst, int sum, int targetSum) {
		if (root != null) {
			sum += root.val;
			lst.add(root.val);
			if (root.left == null && root.right == null) {
				if (sum == targetSum) {
					ans.add(lst);
				}
			} else {
				int i = lst.size();
				sum(root.left, new ArrayList<>(lst), sum, targetSum);
				lst.subList(0, i);
				sum(root.right, new ArrayList<>(lst), sum, targetSum);
			}
		}
	}
}
