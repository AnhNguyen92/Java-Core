package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1313
 */
public class DecompressRunLengthEncodedList {
	public int[] decompressRLElist(int[] nums) {
		int len = 0;

		for (int i = 0; i < nums.length; i += 2) {
			len += nums[i];
		}
		int[] arr = new int[len];
		int index = 0;
		for (int i = 0; i < nums.length; i += 2) {
			for (int k = 0; k < nums[i]; k++) {
				arr[index++] = nums[i + 1];
			}
		}
		return arr;
	}
}
