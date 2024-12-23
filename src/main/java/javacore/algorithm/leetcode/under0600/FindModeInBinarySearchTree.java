package javacore.algorithm.leetcode.under0600;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 501. Find Mode in Binary Search Tree
 */
public class FindModeInBinarySearchTree {
	public int[] findMode(TreeNode root) {
		HashMap<Integer, Integer> map = new HashMap<>();
		addMode(map, root);
		List<Integer> lst = new ArrayList<>();
		int max = -1;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			if (max < value) {
				lst = new ArrayList<>();
				max = value;
				lst.add(entry.getKey());
			} else if (max == value) {
				lst.add(entry.getKey());
			}
		}

		int[] arr = new int[lst.size()];
		for (int i = 0; i < lst.size(); i++) {

			arr[i] = lst.get(i);
		}

		return arr;
	}

	private void addMode(Map<Integer, Integer> map, TreeNode root) {
		if (root != null) {
            map.compute(root.val, (k, j) -> (j == null) ? 1 : j + 1);
			addMode(map, root.left);
			addMode(map, root.right);
		}
	}
}
