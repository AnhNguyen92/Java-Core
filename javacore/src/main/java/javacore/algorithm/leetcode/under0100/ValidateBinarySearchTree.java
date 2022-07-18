package javacore.algorithm.leetcode.under0100;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 98
 */
public class ValidateBinarySearchTree {
	List<Integer> lst = new ArrayList<>();

	public boolean isValidBST(TreeNode root) {
		travel(root);
		for (int i = 1; i < lst.size(); i++) {
			if (lst.get(i) <= lst.get(i - 1)) {
				return false;
			}
		}
		return true;
	}

	private void travel(TreeNode root) {
		if (root != null) {
			travel(root.left);
			lst.add(root.val);
			travel(root.right);
		}
	}
}
