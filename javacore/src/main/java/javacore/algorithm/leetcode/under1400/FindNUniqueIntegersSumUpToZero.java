package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1304. Find N Unique Integers Sum up to Zero
 */
public class FindNUniqueIntegersSumUpToZero {
	public int[] sumZero(int n) {
		int[] arr = new int[n];
		int mid = n / 2;
		if (n % 2 == 1) {
			arr[mid] = 0;
			for (int i = mid + 1; i < n; i++) {
				arr[i] = i - mid;
			}
			for (int i = mid - 1; i >= 0; i--) {
				arr[i] = i - mid;
			}
		} else {
			for (int i = mid; i < n; i++) {
				arr[i] = i + 1 - mid;
			}
			for (int i = mid - 1; i >= 0; i--) {
				arr[i] = i - mid;
			}
		}

		return arr;
	}
}
