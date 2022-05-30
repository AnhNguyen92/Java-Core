package javacore.algorithm.leetcode.under0900;

import javacore.algorithm.leetcode.model.TreeNode;

public class BinaryTreePruning {
	public TreeNode pruneTree(TreeNode root) {
        if (root != null) {
            root.left = pruneTree(root.left);
            root.right = pruneTree(root.right);
            if (root.left == null && root.right == null && root.val == 0) {
                return null;
            }
        }
        return root;
    }
}
