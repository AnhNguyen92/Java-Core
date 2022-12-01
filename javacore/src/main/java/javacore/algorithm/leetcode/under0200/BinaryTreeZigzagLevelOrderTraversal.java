package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 103. Binary Tree Zigzag Level Order Traversal
 */
public class BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> lst = new ArrayList<>();
		travel(lst, root, 0, true);
		return lst;
	}

	private void travel(List<List<Integer>> lst, TreeNode root, int height, boolean dir) {
		if (root != null) {
			if (height == lst.size()) {
				lst.add(new ArrayList<>());
			}
			List<Integer> item = lst.get(height);
			if (dir) {
				item.add(root.val);
			} else {
				item.add(0, root.val);
			}
			travel(lst, root.left, height + 1, !dir);
			travel(lst, root.right, height + 1, !dir);
		}
	}
}
