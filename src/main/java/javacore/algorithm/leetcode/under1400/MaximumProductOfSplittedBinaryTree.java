package javacore.algorithm.leetcode.under1400;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1339. Maximum Product of Splitted Binary Tree
 */
public class MaximumProductOfSplittedBinaryTree {
	Set<Long> set = new HashSet<>();

    public int maxProduct(TreeNode root) {
        long ans = 0l;
        long sum = sum(root);
        List<Long> lst = new ArrayList<>(set);
        for (Long i : lst) {
            ans = Math.max(ans, (sum - i.longValue()) * i.longValue());
        }
        
        return (int) (ans  % 1000000007l);
    }

    private long sum(TreeNode root) {
        if (root == null) {
            return 0l;
        }
        long left = sum(root.left);
        set.add(left);
        long right = sum(root.right);
        set.add(right);
        
        set.add( ((long) root.val) + left + right);
        return root.val + left + right;
    }
}
