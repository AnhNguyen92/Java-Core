package javacore.algorithm.leetcode.under0200;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 129
 */
public class SumRootToLeafNumbers {
	public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }
    
    private int sum(TreeNode root, int sum) {
        if (root != null) {
            sum = sum * 10 + root.val;
            if (root.left != null && root.right != null) {
                return sum(root.left, sum) + sum(root.right, sum);
            }
            if (root.left != null && root.right == null) {
                return sum(root.left, sum);
            }
            if (root.left == null && root.right != null) {
                return sum(root.right, sum);
            }
        }
        return sum;
    }
}
