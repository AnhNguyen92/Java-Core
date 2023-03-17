package javacore.algorithm.leetcode.under1300;

/*
 * LeetCode 1252. Cells with Odd Values in a Matrix
 */
public class CellsWithOddValuesInAMatrix {
	public int oddCells(int n, int m, int[][] indices) {
		int result = 0;
		int[] row = new int[n];
		int[] col = new int[m];

		for (int i = 0; i < indices.length; i++) {
			row[indices[i][0]]++;
			col[indices[i][1]]++;
		}

		for (int j = 0; j < n; j++) {
			for (int k = 0; k < m; k++) {
				result += (row[j] + col[k]) % 2;
			}
		}

		return result;
	}
}
