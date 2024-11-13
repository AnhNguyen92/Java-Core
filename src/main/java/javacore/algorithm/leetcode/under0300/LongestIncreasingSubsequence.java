package javacore.algorithm.leetcode.under0300;

/**
 * 300. Longest Increasing Subsequence
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    arr[i] = Math.max(arr[i], arr[j] + 1);
                }
            }
        }
        int max = 0;
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max + 1;
    }
}
