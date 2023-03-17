package javacore.algorithm.leetcode.under0051;

import java.util.Arrays;

/*
 * LeetCode 4. Median of Two Sorted Arrays
 */
public class MedianOfTwoSortedArrays {
	// not using array
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int left = nums1.length;
		int right = nums2.length;
		int len = left + right;
		int i = 0;
		int j = 0;
		int mid = len / 2;
		int m = 0;
		int n = 0;
		for (int k = 0; k <= mid; k++) {
			if (i == left) {
				n = m;
				m = nums2[j++];
			} else if (j == right) {
				n = m;
				m = nums1[i++];
			} else {
				if (nums1[i] < nums2[j]) {
					n = m;
					m = nums1[i++];
				} else {
					n = m;
					m = nums2[j++];
				}
			}
		}
		if (len % 2 == 1) {
			return m;
		}
		return (m + n) / 2.0;
	}

	public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
		int left = nums1.length;
		int right = nums2.length;
		int len = left + right;
		int[] result = new int[len];
		int i = 0;
		int j = 0;
		int mid = len / 2;
		for (int k = 0; k <= mid; k++) {
			if (i == left) {
				result[k] = nums2[j++];
			} else if (j == right) {
				result[k] = nums1[i++];
			} else {
				if (nums1[i] < nums2[j]) {
					result[k] = nums1[i++];
				} else {
					result[k] = nums2[j++];
				}
			}
		}
		if (len % 2 == 1) {
			return result[mid];
		}
		return (result[mid - 1] + result[mid]) / 2.0;
	}

	public double findMedianSortedArrays3(int[] nums1, int[] nums2) {
		int left = nums1.length;
		int right = nums2.length;
		int len = left + right;
		int[] result = new int[len];
		System.arraycopy(nums1, 0, result, 0, left);
		System.arraycopy(nums2, 0, result, left, right);
		Arrays.sort(result);
		int mid = len / 2;
		if (len % 2 == 1) {
			return result[mid];
		}
		return (result[mid - 1] + result[mid]) / 2.0;
	}
}
