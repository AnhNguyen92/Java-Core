package javacore.algorithm.leetcode.under1300;

/*
 * LeetCode 1287. Element Appearing More Than 25% In Sorted Array
 */
public class ElementAppearingMoreThan25InSortedArray {
	public int findSpecialInteger(int[] arr) {
		int times = arr.length / 4;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[i + times]) {
				return arr[i];
			}
		}
		return arr[0];
	}
}
