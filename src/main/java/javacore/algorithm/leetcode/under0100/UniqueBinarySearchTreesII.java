package javacore.algorithm.leetcode.under0100;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 95. Unique Binary Search Trees II
 */
public class UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        return generateTrees(arr);
    }

    public List<TreeNode> generateTrees(int[] nums) {
        if (nums == null || nums.length == 0) {
            return List.of(null);
        }
        return generateTrees(nums, 0, nums.length - 1);
    }

    private List<TreeNode> generateTrees(int[] nums, int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();

        if (start > end) {
            allTrees.add(null); // Add null for empty subtree
            return allTrees;
        }

        // Iterate through the array and consider each element as a root
        for (int i = start; i <= end; i++) {
            // Generate all possible left and right subtrees
            List<TreeNode> leftSubtrees = generateTrees(nums, start, i - 1);
            List<TreeNode> rightSubtrees = generateTrees(nums, i + 1, end);

            // Combine left and right subtrees with the current root
            for (TreeNode left : leftSubtrees) {
                for (TreeNode right : rightSubtrees) {
                    TreeNode root = new TreeNode(nums[i], left, right);
                    allTrees.add(root);
                }
            }
        }
        return allTrees;
    }
}
