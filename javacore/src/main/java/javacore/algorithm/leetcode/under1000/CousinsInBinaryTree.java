package javacore.algorithm.leetcode.under1000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leetcode 993
 */
public class CousinsInBinaryTree {
	public boolean isCousins(TreeNode root, int x, int y) {
		if (root.val == x || root.val == y) {
			return false;
		}
		Map<Integer, List<Integer>> map = new HashMap<>();
		findNodePosition(root, map, 0);
		List<Integer> left = map.get(x);
		List<Integer> right = map.get(y);
		return right.get(0).equals(left.get(0)) && !right.get(1).equals(left.get(1));
	}

	public void findNodePosition(TreeNode root, Map<Integer, List<Integer>> map, int height) {
		if (root != null) {
			if (root.left != null) {
				map.put(root.left.val, Arrays.asList(height + 1, root.val));
				findNodePosition(root.left, map, height + 1);
			}
			if (root.right != null) {
				map.put(root.right.val, Arrays.asList(height + 1, root.val));
				findNodePosition(root.right, map, height + 1);
			}
		}
	}
}
