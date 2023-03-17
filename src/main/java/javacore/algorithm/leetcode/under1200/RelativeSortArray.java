package javacore.algorithm.leetcode.under1200;

import java.util.Arrays;

/*
 * LeetCode 1122. Relative Sort Array
 */
public class RelativeSortArray {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int i = 0;
		for (int n : arr2) {
			for (int j = i; j < arr1.length; j++) {
				if (arr1[j] == n) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
					i++;
				}
			}
		}
		Arrays.sort(arr1, i, arr1.length);
		return arr1;
	}

	public int[] relativeSortArray2(int[] arr1, int[] arr2) {
		int[] st = new int[1001];
		for (int x : arr1)
			st[x]++;
		int j = 0;
		for (int p : arr2) {
			for (int i = 0; i < st[p]; i++)
				arr1[j++] = p;
			st[p] = 0;
		}
		for (int k = 1; k <= 1000; k++) {
			for (int i = 0; i < st[k]; i++)
				arr1[j++] = k;
		}
		return arr1;
	}
}
