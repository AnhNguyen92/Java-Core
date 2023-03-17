package javacore.algorithm.leetcode.under0200;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 124. Binary Tree Maximum Path Sum
 */
public class BinaryTreeMaximumPathSum {
	int val = Integer.MIN_VALUE;
	
	public int maxPathSum(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }
        travel(root);
        return val;
    }

    private int travel(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = travel(root.left);
        int right = travel(root.right);
        int max = -1001;
        if (left != 0) {
            max = left;
        }
        if (right != 0) {
            if (max != 0) {
                max = Math.max(max, right);
            } else {
                max = right;
            }
        }
        val = Math.max(val, Math.max(max, root.val));
        val = Math.max(val, Math.max(root.val, root.val + max));
        val = Math.max(val, Math.max(root.val, root.val + left + right));
        if (max > 0)
        root.val += max;
        return root.val;
    }
    
}
