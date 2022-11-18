package javacore.algorithm.leetcode.under1100;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1028. Recover a Tree From Preorder Traversal
 */
public class RecoverATreeFromPreorderTraversal {
	int val;
	int count;
	List<List<TreeNode>> lst;

	public TreeNode recoverFromPreorder(String traversal) {
		lst = new ArrayList<>();
		val = 0;
		count = 0;
		for (int i = 0; i < traversal.length(); i++) {
			char c = traversal.charAt(i);
			if (c != '-') {
				val = val * 10 + c - '0';
			} else {
				if (val == 0) {
					count++;
				} else {
					TreeNode tree = new TreeNode(val);
					if (count == lst.size()) {
						lst.add(new ArrayList<>());
					}
					List<TreeNode> item = lst.get(count);
					item.add(tree);
					if (count > 0) {
						List<TreeNode> prev = lst.get(count - 1);
						TreeNode parrent = prev.get(prev.size() - 1);
						if (parrent.left == null) {
							parrent.left = tree;
						} else {
							parrent.right = tree;
						}
					}
					val = 0;
					count = 1;
				}
			}
		}
		if (val > 0) {
			TreeNode tree = new TreeNode(val);
			if (count == lst.size()) {
				lst.add(new ArrayList<>());
			}
			List<TreeNode> item = lst.get(count);
			item.add(tree);
			if (count > 0) {
				List<TreeNode> prev = lst.get(count - 1);
				TreeNode parrent = prev.get(prev.size() - 1);
				if (parrent.left == null) {
					parrent.left = tree;
				} else {
					parrent.right = tree;
				}
			}
		}

		return lst.get(0).get(0);
	}

}
