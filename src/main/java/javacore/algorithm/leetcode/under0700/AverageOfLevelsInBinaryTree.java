package javacore.algorithm.leetcode.under0700;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 637. Average of Levels in Binary Tree
 */
public class AverageOfLevelsInBinaryTree {
	List<List<Integer>> lst = new ArrayList<>();
	int size = lst.size();

	public List<Double> averageOfLevels(TreeNode root) {
		addNodeSum(root, 0);
		List<Double> ans = new ArrayList<>();
		for (List<Integer> item : lst) {
			double sum = 0.0;
			int count = 0;
			for (Integer i : item) {
				sum += i.intValue();
				count++;
			}
			ans.add(sum / count);
		}
		return ans;
	}

	private void addNodeSum(TreeNode root, int degree) {
		if (root != null) {
			if (degree == size) {
				List<Integer> item = new ArrayList<>();
				item.add(root.val);
				lst.add(item);
				size++;
			} else {
				List<Integer> item = lst.get(degree);
				item.add(root.val);
			}
			addNodeSum(root.left, degree + 1);
			addNodeSum(root.right, degree + 1);
		}
	}
}
