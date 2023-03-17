package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 560. Subarray Sum Equals K
 */
public class SubarraySumEqualsK {
	public int subarraySum(int[] nums, int k) {
		int count = 0;
		int sum;
		int min = 0;
		int max = 0;
		for (int i : nums) {
			if (i < 0)
				min += i;
			else
				max += i;
		}
		if (min > k || max < k)
			return 0;
		for (int i = 0; i < nums.length; i++) {
			sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if (sum == k) {
					count++;
				}
			}
		}
		return count;
	}
}
