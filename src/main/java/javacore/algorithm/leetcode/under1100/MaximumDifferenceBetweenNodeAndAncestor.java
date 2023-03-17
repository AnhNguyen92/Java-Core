package javacore.algorithm.leetcode.under1100;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1026. Maximum Difference Between Node and Ancestor
 */
public class MaximumDifferenceBetweenNodeAndAncestor {
	public int maxAncestorDiff(TreeNode root) {
		List<Integer> lst = new ArrayList<>();
		return travel(lst, root, root.val);
	}

	public int travel(List<Integer> lst, TreeNode root, int rootVal) {
		int max = 0;
		if (root != null) {
			if (root.right != null)
				max = travel(lst, root.right, root.right.val);
			if (lst.isEmpty() || root.val > lst.get(lst.size() - 1))
				lst.add(root.val);
			else
				lst.add(0, root.val);
			if (root.left != null)
				max = Math.max(max, travel(lst, root.left, root.left.val));
			int a = Math.abs(rootVal - lst.get(0));
			int b = Math.abs(rootVal - lst.get(lst.size() - 1));
			max = Math.max(max, Math.max(a, b));
		}
		return max;
	}
}
