package javacore.algorithm.leetcode.under0700;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 623. Add One Row to Tree
 */
public class AddOneRowToTree {
	public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth > 1) {
            travel(root, val, 1, depth);
            return root;
        }
        return new TreeNode(val, root, null);
    }
    
    private void travel(TreeNode root, int val, int rootDepth, int depth) {
        if (rootDepth < depth - 1) {
            if (root.left != null)
                travel(root.left, val, rootDepth + 1, depth);
            if (root.right != null)
                travel(root.right, val, rootDepth + 1, depth);
        } else {
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
        }
    }
}
