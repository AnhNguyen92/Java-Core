package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 941. Valid Mountain Array
 */
public class ValidMountainArray {
	public boolean validMountainArray(int[] arr) {
		if (arr.length < 3)
			return false;
		int left = 0;
		int right = arr.length - 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				left++;
			} else {
				break;
			}
		}
		for (int i = arr.length - 1; i >= 1; i--) {
			if (arr[i - 1] > arr[i]) {
				right--;
			} else {
				break;
			}
		}
		if (left == 0 || right == arr.length - 1)
			return false;
		return left == right;
	}
}
