package javacore.algorithm.leetcode.under0600;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 530
 */
public class MinimumAbsoluteDifferenceInBST {
	int minDiff = Integer.MAX_VALUE;
	TreeNode last = null;

	public void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			if (last != null)
				minDiff = (minDiff < (root.val - last.val)) ? minDiff : (root.val - last.val);
			last = root;
			inorder(root.right);
		}
	}

	public int getMinimumDifference(TreeNode root) {
		inorder(root);
		return minDiff;
	}

	public int getMinimumDifference1(TreeNode root) {
		List<Integer> lst = new ArrayList<>();
		minimunDiff(root, lst);
		int[] arr = new int[lst.size()];
		for (int i = 0; i < lst.size(); i++) {
			arr[i] = lst.get(i).intValue();
		}
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i] - arr[i - 1]);
		}
		return min;
	}

	private void minimunDiff(TreeNode root, List<Integer> lst) {
		if (root != null) {
			lst.add(root.val);
			minimunDiff(root.left, lst);
			minimunDiff(root.right, lst);
		}

	}
}
