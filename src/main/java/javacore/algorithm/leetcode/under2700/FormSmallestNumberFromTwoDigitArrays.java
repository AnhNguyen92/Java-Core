package javacore.algorithm.leetcode.under2700;

import java.util.Arrays;

/*
 * LeetCode 2605. Form Smallest Number From Two Digit Arrays
 */
public class FormSmallestNumberFromTwoDigitArrays {
	public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                return nums1[i];
            }
        }
        return Math.min(nums1[0], nums2[0]) * 10 + Math.max(nums1[0], nums2[0]);
    }
}
