package javacore.algorithm.leetcode.under0300;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 222. Count Complete Tree Nodes
 */
public class CountCompleteTreeNodes {
	public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
