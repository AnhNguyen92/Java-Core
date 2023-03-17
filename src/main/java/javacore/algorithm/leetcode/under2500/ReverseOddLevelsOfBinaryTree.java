package javacore.algorithm.leetcode.under2500;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2415. Reverse Odd Levels of Binary Tree
 */
public class ReverseOddLevelsOfBinaryTree {
	List<List<TreeNode>> lst = new ArrayList<>();

	public TreeNode reverseOddLevels(TreeNode root) {
		travel(root, 0);
		for (int i = 1; i < lst.size(); i += 2) {
			List<TreeNode> item = lst.get(i);
			int n = item.size();
			for (int j = 0; j < n / 2; j++) {
				TreeNode first = item.get(j);
				TreeNode last = item.get(n - 1 - j);
				int temp = first.val;
				first.val = last.val;
				last.val = temp;
			}
		}

		return root;
	}

	private void travel(TreeNode root, int level) {
		if (root != null) {
			if (lst.size() == level) {
				lst.add(new ArrayList<>());
			}
			List<TreeNode> item = lst.get(level);
			item.add(root);
			travel(root.left, level + 1);
			travel(root.right, level + 1);
		}
	}

}
