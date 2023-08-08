package javacore.algorithm.leetcode.under0700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 652. Find Duplicate Subtrees
 */
public class FindDuplicateSubtrees {
	Map<String, Integer> map;
	List<TreeNode> ans;

	public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
		map = new HashMap<>();
		ans = new ArrayList<>();
		flattern(root);
		return ans;
	}

	private void flattern(TreeNode root) {
		if (root != null) {
			flattern(root.left);
			flattern(root.right);
			List<Integer> lst = new ArrayList<>();
			preOrder(lst, root);
			String s = lst.stream().map(Object::toString).collect(Collectors.joining(","));
			map.put(s, map.getOrDefault(s, 0) + 1);
			if (map.get(s) == 2) {
				ans.add(root);
			}
		}
	}

	private void preOrder(List<Integer> lst, TreeNode root) {
		if (root != null) {
			lst.add(root.val);
			preOrder(lst, root.left);
			preOrder(lst, root.right);
		} else {
			lst.add(-201);
		}
	}
}
