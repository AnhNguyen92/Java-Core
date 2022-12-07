package javacore.algorithm.leetcode.under0600;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 *  Leetcode 572. Subtree of Another Tree
 */
public class SubtreeOfAnotherTree {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return isSubtree(root, subRoot, false);
        
    }

	public boolean isSubtree(TreeNode root, TreeNode subRoot, boolean isContinue) {
        if (root == null) {
            return subRoot == null;
        }
        if (subRoot == null) {
            return false;
        }
        if (!isContinue) {
            if (isSubtree(root.right, subRoot, false) || isSubtree(root.left, subRoot, false)) {
                return true;
            }
        }
        return (root.val == subRoot.val)
                    && isSubtree(root.left, subRoot.left, true)
                    && isSubtree(root.right, subRoot.right, true);
    }
}
