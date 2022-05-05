package javacore.algorithm.leetcode.under1900;

/*
 * LeetCode 1822
 */
public class SignOfTheProductOfAnArray {
	public int arraySign(int[] nums) {
		int prod = signFunc(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			prod *= signFunc(nums[i]);
		}
		return prod;
	}

	private int signFunc(int x) {
		if (x > 0)
			return 1;
		return ((x == 0) ? 0 : -1);
	}
}
