package javacore.algorithm.leetcode.under1000;

import javacore.algorithm.leetcode.model.TreeNode;

/**
 * 979. Distribute Coins in Binary Tree
 */
public class DistributeCoinsInBinaryTree {
    int ans = 0;

    public int distributeCoins(TreeNode root) {
        int count = Math.abs(travel(root));
        return ans + count;
    }

    private int travel(TreeNode root) {
        int change = 0;
        if (root != null) {
            int count = 0;
            if (root.left != null) {
                count = travel(root.left);
                change += count;
                ans += Math.abs(count);
            }
            if (root.right != null) {
                count = travel(root.right);
                change += count;
                ans += Math.abs(count);
            }
            change += root.val - 1;
        }
        return change;
    }
}
