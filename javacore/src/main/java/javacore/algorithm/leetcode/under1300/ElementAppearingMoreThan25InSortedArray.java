package javacore.algorithm.leetcode.under1300;

/*
 * Leetcode 1287
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
