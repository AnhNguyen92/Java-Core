package javacore.algorithm.leetcode.under0300;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 226. Invert Binary Tree
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.right);
        invertTree(root.left);

        return root;
    }
}
