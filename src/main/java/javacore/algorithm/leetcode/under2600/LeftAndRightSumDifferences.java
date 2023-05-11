package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2574. Left and Right Sum Differences
 */
public class LeftAndRightSumDifferences {
	public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i-1];
        }
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i+1];
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return arr;
    }
}
