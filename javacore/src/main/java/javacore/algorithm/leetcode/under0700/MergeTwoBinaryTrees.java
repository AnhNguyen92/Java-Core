package javacore.algorithm.leetcode.under0700;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 617. Merge Two Binary Trees
 */
public class MergeTwoBinaryTrees {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode result = new TreeNode();
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        
        result.left = mergeTrees(t1.left, t2.left);
        result.right = mergeTrees(t1.right, t2.right);
        result.val = t1.val + t2.val;
        
        return result;
    }
}
