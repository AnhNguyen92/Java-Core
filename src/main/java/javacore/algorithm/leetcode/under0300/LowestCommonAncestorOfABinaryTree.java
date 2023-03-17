package javacore.algorithm.leetcode.under0300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 236. Lowest Common Ancestor of a Binary Tree
 */
public class LowestCommonAncestorOfABinaryTree {
	Map<TreeNode, TreeNode> map = new HashMap<>();

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		travelTree(root);
		List<TreeNode> lst = new ArrayList<>();
		lst.add(p);
		while (map.get(p) != null) {
			lst.add(map.get(p));
			p = map.get(p);
		}
		while (!lst.contains(q)) {
			q = map.get(q);
		}
		return q;
	}

	private void travelTree(TreeNode root) {
		if (root != null) {
			if (root.left != null) {
				map.put(root.left, root);
				travelTree(root.left);
			}
			if (root.right != null) {
				map.put(root.right, root);
				travelTree(root.right);
			}
		}
	}
}
