package javacore.algorithm.leetcode.under0700;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 654. Maximum Binary Tree
 */
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end)
            return new TreeNode(nums[start]);
        int index = largest(nums, start, end);
        TreeNode root = new TreeNode(nums[index]);
        root.left = buildTree(nums, start, index - 1);
        root.right = buildTree(nums, index + 1, end);
        return root;
    }

    private int largest(int[] arr, int start, int end) {
        int index = start;
        for (int i = start; i <= end; i++)
            if (arr[i] > arr[index]) {
                index = i;
            }

        return index;
    }
}
