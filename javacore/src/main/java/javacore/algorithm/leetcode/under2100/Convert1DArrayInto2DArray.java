package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2022. Convert 1D Array Into 2D Array
 */
public class Convert1DArrayInto2DArray {
	public int[][] construct2DArray(int[] original, int m, int n) {
		if (m * n != original.length) {
			return new int[0][n];
		}
		int[][] arr = new int[m][n];
		int i = 0;
		int j = 0;
		int k = 0;
		while (k < original.length) {
			arr[i][j] = original[k];
			if (i < m - 1) {
				i++;
			} else if (i == m - 1) {
				i = 0;
				j++;
			} else if (j == n - 1) {
				j = 0;
				i++;
			}
			k++;
		}
		return arr;
	}
}
