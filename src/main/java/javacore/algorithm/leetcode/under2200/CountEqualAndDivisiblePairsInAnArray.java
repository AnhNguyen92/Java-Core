package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2176. Count Equal and Divisible Pairs in an Array
 */
public class CountEqualAndDivisiblePairsInAnArray {
	public int countPairs(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && ((i * j) % k == 0)) {
					count++;
				}
			}
		}
		return count;
	}
}
