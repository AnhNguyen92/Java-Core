package javacore.algorithm.leetcode.under900;

/*
 * LeetCode 852
 */
public class PeakIndexInAMountainArray {
	public int peakIndexInMountainArray(int[] arr) {
		int i = 0;
		while (i + 1 <= arr.length && arr[i] < arr[i + 1]) {
			i++;
		}
		return i;
	}
}
