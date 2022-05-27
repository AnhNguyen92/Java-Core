package javacore.algorithm.leetcode.under1600;

/*
 * LeetCode 1588
 */
public class SumOfAllOddLengthSubarrays {
	public int sumOddLengthSubarrays(int[] arr) {
		int temp = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = 0;
			for (int j = i; j < arr.length; j++) {
				temp += arr[j];
				if ((j - i) % 2 == 0) {
					sum += temp;
				}
			}
		}
		return sum;
	}
}
