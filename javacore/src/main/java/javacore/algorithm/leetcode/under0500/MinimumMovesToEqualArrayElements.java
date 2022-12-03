package javacore.algorithm.leetcode.under0500;

/*
 * Leetcode 453. Minimum Moves to Equal Array Elements
 */
public class MinimumMovesToEqualArrayElements {
	public int minMoves(int[] nums) {
		int sum = 0;
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			min = Math.min(nums[i], min);
		}
		return sum - nums.length * min;
	}
}
