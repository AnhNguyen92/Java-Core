package javacore.algorithm.leetcode.under0900;

/*
 * LeetCode 852. Peak Index in a Mountain Array
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
