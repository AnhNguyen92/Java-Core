package vn.com.ids.javacore.algorithm.leetcode.under101;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Leetcode 100
 */

public class SameTree {
    private static final Logger logger = LoggerFactory.getLogger(SameTree.class);
    
    public static void main(String[] args) {
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        TreeNode p = new TreeNode(2, left, right);
        TreeNode q = new TreeNode(2, left, right);
        logger.info("{}", isSameTree(p, q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        if (isSameTree(p.left, q.left)) {
            return isSameTree(p.right, q.right);
        }
        return false;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
