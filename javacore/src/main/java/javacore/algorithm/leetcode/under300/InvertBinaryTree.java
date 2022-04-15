package javacore.algorithm.leetcode.under300;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leet code #226
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
