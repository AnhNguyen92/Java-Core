package javacore.algorithm.leetcode.under0200;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 108. Convert Sorted Array to Binary Search Tree
 */
public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
		return insertAVLTree(nums, 0, nums.length - 1);
    }
    
    private TreeNode insertAVLTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = insertAVLTree(nums, start, mid - 1);
        root.right = insertAVLTree(nums, mid + 1, end);
        
        return root;
    }
}
