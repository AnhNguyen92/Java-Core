package javacore.algorithm.leetcode.under0500;

/*
 * LeetCode 453. Minimum Moves to Equal Array Elements
 */
public class MinimumMovesToEqualArrayElements {
	public int minMoves(int[] nums) {
		int sum = 0;
		int min = nums[0];
        for (int num : nums) {
            sum += num;
            min = Math.min(num, min);
        }
		return sum - nums.length * min;
	}
}
