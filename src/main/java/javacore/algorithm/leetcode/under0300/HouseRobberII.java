package javacore.algorithm.leetcode.under0300;

/*
 * LeetCode 213. House Robber II
 */
public class HouseRobberII {
	public int rob(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int[] arr = new int[nums.length - 1];
		System.arraycopy(nums, 0, arr, 0, arr.length);
		int traverse = traverse(arr);
		System.arraycopy(nums, 1, arr, 0, arr.length);
		int traverse2 = traverse(arr);
		return Math.max(traverse, traverse2);
	}

	private int traverse(int[] nums) {
		if (nums.length == 0)
			return 0;

		int[] dp = new int[nums.length + 1];

		dp[0] = 0;
		dp[1] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			dp[i + 1] = Math.max(nums[i] + dp[i - 1], dp[i]);
		}
		return dp[nums.length];
	}

}
