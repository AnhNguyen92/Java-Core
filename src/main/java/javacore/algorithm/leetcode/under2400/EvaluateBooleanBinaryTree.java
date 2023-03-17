package javacore.algorithm.leetcode.under2400;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 2331. Evaluate Boolean Binary Tree
 */
public class EvaluateBooleanBinaryTree {
	public boolean evaluateTree(TreeNode root) {
        if (root == null || root.val == 1) {
            return true;
        }
        if (root.val == 0) {
            return false;
        }
        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        }
        return evaluateTree(root.left) && evaluateTree(root.right);
    }
}
