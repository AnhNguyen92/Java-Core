package javacore.algorithm.leetcode.under1600;

import java.util.Arrays;

/*
 * LeetCode 1508. Range Sum of Sorted Subarray Sums
 */
public class RangeSumOfSortedSubarraySums {

	public int rangeSum(int[] nums, int n, int left, int right) {
		int[] ans = new int[n*(n+1) / 2];
        int index = 0;
		for (int i = 0; i < n; i++) {
			int prefixSum = nums[i];
			ans[index++] = nums[i];
			for (int j = i + 1; j < n; j++) {
				prefixSum += nums[j];
				ans[index++] = prefixSum;
			}
		}
		Arrays.sort(ans);
		long sum = 0;
		for (int i = left - 1; i <= right - 1; i++) {
			sum += ans[i];
		}
		return (int) (sum % 1000000007);
	}
}