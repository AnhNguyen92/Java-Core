package javacore.algorithm.leetcode.under600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leetcode 501
 */
public class FindModeinBinarySearchTree {
	public int[] findMode(TreeNode root) {
		HashMap<Integer, Integer> map = new HashMap<>();
		addMode(map, root);
		List<Integer> lst = new ArrayList<>();
		int max = -1;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue().intValue();
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
			Integer j = map.get(root.val);
			map.put(root.val, (j == null) ? 1 : j + 1);
			addMode(map, root.left);
			addMode(map, root.right);
		}
	}
}
