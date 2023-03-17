package javacore.algorithm.leetcode.under0300;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 235. Lowest Common Ancestor of a Binary Search Tree
 */
public class LowestCommonAncestorOfABinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val - p.val) * (root.val - q.val) <= 0 ) {
            return root;
        }
        if (root.val - q.val > 0) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return lowestCommonAncestor(root.right, p, q);
    }
}
