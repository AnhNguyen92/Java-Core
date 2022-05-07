package javacore.algorithm.leetcode.under0100;

import java.util.Arrays;

/*
 * LeetCode 88
 */
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = 0; i < n; i++) {
			nums1[i + m] = nums2[i];
		}
		Arrays.sort(nums1);
	}
}
