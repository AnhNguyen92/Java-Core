package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2341. Maximum Number of Pairs in Array
 */
public class MaximumNumberOfPairsInArray {
    public int[] numberOfPairs(int[] nums) {
        int[] ans = new int[2];
        int[] arr = new int[101];
        for (int i : nums) {
            arr[i]++;
        }
        for (int val : arr) {
            ans[0] += val / 2;
            ans[1] += val % 2;
        }

        return ans;
    }
}
