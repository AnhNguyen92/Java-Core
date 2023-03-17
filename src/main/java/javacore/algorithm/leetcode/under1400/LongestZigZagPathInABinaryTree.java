package javacore.algorithm.leetcode.under1400;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1372. Longest ZigZag Path in a Binary Tree
 */
public class LongestZigZagPathInABinaryTree {
	Map<TreeNode, Integer> map = new HashMap<>();

	public int longestZigZag(TreeNode root) {
        return Math.max(traverse(root.left, true, 0), traverse(root.right, false, 0));
    }

    private int traverse(TreeNode root, boolean left,int count) {
        if (root == null) {
            return count;
        }
        if (map.get(root) != null) {
            return map.get(root);
        }
        int max = left ? traverse(root.right, false, count + 1) : traverse(root.left, true, count + 1);
        
        max = Math.max(max, Math.max(traverse(root.left, true, 0), traverse(root.right, false, 0)));
        map.put(root, max);
        return max;
    }
}
