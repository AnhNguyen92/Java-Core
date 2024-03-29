package javacore.algorithm.leetcode.under0600;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 563. Binary Tree Tilt
 */
public class BinaryTreeTilt {
	public int findTilt(TreeNode root) {
        travel(root);
        return sum(root);
    }
    
    public void travel(TreeNode root) {
        if (root != null) {
            root.val = Math.abs(sum(root.left) - sum(root.right));
            travel(root.left);
            travel(root.right);
        }
    }
    
    public int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        return root.val + sum(root.left) + sum(root.right);
    }
}
