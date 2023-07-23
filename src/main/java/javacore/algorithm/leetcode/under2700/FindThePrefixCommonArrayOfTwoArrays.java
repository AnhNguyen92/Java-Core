package javacore.algorithm.leetcode.under2700;

/*
 * LeetCode 2657. Find the Prefix Common Array of Two Arrays
 */
public class FindThePrefixCommonArrayOfTwoArrays {
	public int[] findThePrefixCommonArray(int[] a, int[] b) {
		int n = a.length;
		int[] arr = new int[n + 1];
		int res[] = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[a[i]] == 1) {
				count++;
			}
			arr[a[i]]++;
			if (arr[b[i]] == 1) {
				count++;
			}
			arr[b[i]]++;
			res[i] = count;
		}
		return res;
	}
}
