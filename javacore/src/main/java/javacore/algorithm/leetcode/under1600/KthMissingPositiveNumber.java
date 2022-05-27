package javacore.algorithm.leetcode.under1600;

/*
 * LeetCode 1539
 */
public class KthMissingPositiveNumber {
	public int findKthPositive(int[] arr, int k) {
		int i = 0;
		int count = 0;
		int ans = arr[arr.length - 1];
		for (int j = 1; i < arr.length && j <= 1000; j++) {
			if (j == arr[i]) {
				i++;
			} else {
				count++;
				if (count == k)
					return j;
			}
		}

		return ans + k - count;
	}
}
