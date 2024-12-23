package javacore.algorithm.leetcode.under0100;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 99. Recover Binary Search Tree
 */
public class RecoverBinarySearchTree {
    List<TreeNode> inOrder = new ArrayList<>();

    public void recoverTree(TreeNode root) {
        inOrder(root);
        List<TreeNode> sorted = new ArrayList<>(inOrder);
        inOrder.sort((a, b) -> {
            if (a.val >= b.val) {
                return 1;
            }
            return -1;
        });
        TreeNode first = null;
        TreeNode second = null;
        for (int i = 0; i < inOrder.size(); i++) {
            if (inOrder.get(i).val != sorted.get(i).val) {
                if (first == null) {
                    first = inOrder.get(i);
                } else {
                    int temp = first.val;
                    first.val = inOrder.get(i).val;
                    second = inOrder.get(i);
                    second.val = temp;
                    break;
                }
            }
        }
    }

    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            inOrder.add(root);
            inOrder(root.right);
        }
    }
}
