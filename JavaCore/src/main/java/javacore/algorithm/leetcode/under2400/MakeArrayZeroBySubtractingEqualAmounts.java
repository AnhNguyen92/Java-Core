package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2357
 */
public class MakeArrayZeroBySubtractingEqualAmounts {
    public int minimumOperations(int[] nums) {
        int[] arr = new int[101];
        for (int i : nums) {
            arr[i] = 1;
        }
        int ans = 0;
        for (int i = 1; i < 101; i++) {
            ans += arr[i];
        }
        return ans;
    }
}
