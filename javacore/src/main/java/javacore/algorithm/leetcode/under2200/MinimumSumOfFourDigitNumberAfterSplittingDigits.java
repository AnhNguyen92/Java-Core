package javacore.algorithm.leetcode.under2200;

import java.util.Arrays;

/*
 * LeetCode 2160
 */
public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
	public int minimumSum(int num) {
		int[] arr = new int[4];
		arr[0] = num % 10;
		arr[1] = (num / 10) % 10;
		arr[2] = (num / 100) % 10;
		arr[3] = num / 1000;
		Arrays.sort(arr);
		return arr[0] * 10 + arr[1] * 10 + arr[2] + arr[3];
	}
}
