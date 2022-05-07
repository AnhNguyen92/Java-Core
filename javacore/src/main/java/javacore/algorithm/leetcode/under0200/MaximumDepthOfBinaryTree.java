package javacore.algorithm.leetcode.under0200;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 104
 */
public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return maxDepth(root, 1);
    }
    
    public int maxDepth(TreeNode root, int depth) {
        int leftDepth = 0;
        int rightDepth = 0;
        if (root.left != null) {
            leftDepth = maxDepth(root.left, depth + 1); 
        }
        if (root.right != null) {
            rightDepth = maxDepth(root.right, depth + 1);
        }
        
        return Math.max(depth, Math.max(leftDepth, rightDepth));
    }
}
