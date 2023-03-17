package javacore.algorithm.leetcode.under0500;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 450. Delete Node in a BST
 */
public class DeleteNodeInABST {
	public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.val = minVal(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private int minVal(TreeNode root) {
        int val = root.val;;
        while (root.left != null) {
            root = root.left;
            val = root.val;
        }
        return val;
    }
}
