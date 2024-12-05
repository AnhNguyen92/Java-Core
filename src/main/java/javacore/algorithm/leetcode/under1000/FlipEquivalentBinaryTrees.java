package javacore.algorithm.leetcode.under1000;

import javacore.algorithm.leetcode.model.TreeNode;

/**
 * 951. Flip Equivalent Binary Trees
 */
public class FlipEquivalentBinaryTrees {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2 == null;
        }
        if (root2 == null) return false;
        return (root1.val == root2.val) && flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left) || (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right));
    }
}
