package vn.com.ids.javacore.algorithm.leetcode;

import vn.com.ids.javacore.algorithm.leetcode.model.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricCompare(root.left , root.right);
    }
    
    public boolean  isSymmetricCompare(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) return true;
        if (leftNode == null || rightNode == null) return false;
        if (leftNode.val != rightNode.val) return false;
        return isSymmetricCompare(leftNode.left, rightNode.right) && isSymmetricCompare(leftNode.right, rightNode.left);
    }
}
