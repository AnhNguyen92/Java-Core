package javacore.algorithm.leetcode.under0100;

import java.util.Arrays;

/*
 * LeetCode 88. Merge Sorted Array
 */
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
		Arrays.sort(nums1);
	}
}
