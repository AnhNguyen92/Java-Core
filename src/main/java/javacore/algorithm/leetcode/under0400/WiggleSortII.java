package javacore.algorithm.leetcode.under0400;

import java.util.Arrays;

/*
 * LeetCode 324. Wiggle Sort II
 */
public class WiggleSortII {
	public void wiggleSort(int[] nums) {
		int n = nums.length;
		int[] arr = new int[n];
		System.arraycopy(nums, 0, arr, 0, n);
		Arrays.sort(arr);
		int l = (n - 1) / 2;
		int r = n - 1;
		for (int i = 0; i < n; i += 2) {
			nums[i] = arr[l--];
		}
		for (int i = 1; i < n; i += 2) {
			nums[i] = arr[r--];
		}
	}
}
