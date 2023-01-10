package javacore.algorithm.leetcode.under0800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 783. Minimum Distance Between BST Nodes
 */
public class MinimumDistanceBetweenBSTNodes {
	public int minDiffInBST(TreeNode root) {
		List<Integer> lst = new ArrayList<>();
		travelTree(lst, root);
		int distance = 100001;
		Collections.sort(lst);
		for (int i = 0; i < lst.size() - 1; i++) {
			distance = Math.min(distance, lst.get(i + 1) - lst.get(i));

		}
		return distance;
	}

	private void travelTree(List<Integer> lst, TreeNode root) {
		if (root != null) {
			lst.add(root.val);
			travelTree(lst, root.left);
			travelTree(lst, root.right);
		}
	}
}
