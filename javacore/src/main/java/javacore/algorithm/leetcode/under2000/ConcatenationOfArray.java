package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1929
 */
public class ConcatenationOfArray {
	public int[] getConcatenation(int[] nums) {
		int n = nums.length;
		int[] ans = new int[2 * n];
		for (int i = 0; i < n; i++) {
			ans[i] = nums[i];
			ans[i + n] = nums[i];
		}
		return ans;
	}
}
