package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 897. Increasing Order Search Tree
 */
public class IncreasingOrderSearchTree {
	public TreeNode increasingBST(TreeNode root) {
		List<Integer> vals = new ArrayList<>();
		inorder(root, vals);
		TreeNode ans = new TreeNode(0), cur = ans;
		for (int v : vals) {
			cur.right = new TreeNode(v);
			cur = cur.right;
		}
		return ans.right;
	}

	public void inorder(TreeNode node, List<Integer> vals) {
		if (node == null)
			return;
		inorder(node.left, vals);
		vals.add(node.val);
		inorder(node.right, vals);
	}
}
