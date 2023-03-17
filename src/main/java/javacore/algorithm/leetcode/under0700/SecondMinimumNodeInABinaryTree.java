package javacore.algorithm.leetcode.under0700;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 671. Second Minimum Node In a Binary Tree
 */
public class SecondMinimumNodeInABinaryTree {
	int min1;
    long ans = Long.MAX_VALUE;

    public void dfs(TreeNode root) {
        if (root != null) {
            if (min1 < root.val && root.val < ans) {
                ans = root.val;
            } else if (min1 == root.val) {
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }
    
    public int findSecondMinimumValue1(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        addNode(root, set);
        if (set.size() < 2) return -1;
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(set);
        treeSet.pollFirst();
        Integer i = treeSet.pollFirst();
        return i.intValue();
    }
    
    private void addNode(TreeNode root, Set<Integer> set) {
        if (root != null) {
            set.add(root.val);
            addNode(root.left, set);
            addNode(root.right, set);
        }
    }
}
