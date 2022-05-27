package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1480
 */
public class RunningSumOf1dArray {
	public int[] runningSum(int[] nums) {
		int[] ans = new int[nums.length];
		ans[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			ans[i] = ans[i - 1] + nums[i];
		}
		return ans;
	}
}