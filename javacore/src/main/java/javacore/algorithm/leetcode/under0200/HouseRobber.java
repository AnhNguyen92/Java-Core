package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 198
 */
public class HouseRobber {
	public int rob(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		int[] arr = new int[nums.length + 1];
		arr[0] = 0;
		arr[1] = nums[0];
		for (int i = 2; i < arr.length; i++) {
			arr[i] = Math.max(arr[i - 1], nums[i - 1] + arr[i - 2]);
		}

		return arr[arr.length - 1];
	}
}
