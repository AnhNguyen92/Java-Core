package javacore.algorithm.leetcode.under0700;

/*
 * LeetCode 645. Set Mismatch
 */
public class SetMismatch {
	public int[] findErrorNums(int[] nums) {
		int[] arr = new int[nums.length + 1];
		int a = 0;
		int b = 0;
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0) {
				a = i;
			}
			if (arr[i] == 2) {
				b = i;
			}
		}
		return new int[] { b, a };
	}
}
