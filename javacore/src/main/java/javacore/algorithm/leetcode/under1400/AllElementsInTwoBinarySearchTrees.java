package javacore.algorithm.leetcode.under1400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1305
 */
public class AllElementsInTwoBinarySearchTrees {
	private List<Integer> lst = new ArrayList<>();

	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		addNode(root1);
		addNode(root2);
		Collections.sort(lst);
		return lst;
	}

	private void addNode(TreeNode root) {
		if (root != null) {
			lst.add(root.val);
			addNode(root.left);
			addNode(root.right);
		}
	}
}
