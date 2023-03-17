package javacore.algorithm.leetcode.under0100;

/*
 * LeetCode 52. N-Queens II
 */
public class NQueensII {
	int count = 0;

	public int totalNQueens(int n) {
		int[][] mat = new int[n][n];
		nQueen(mat, 0);
		return count;
	}

	private boolean isSafe(int[][] mat, int r, int c) {
		for (int i = 0; i < r; i++) {
			if (mat[i][c] == 1) {
				return false;
			}
		}
		for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
			if (mat[i][j] == 1) {
				return false;
			}
		}
		for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++) {
			if (mat[i][j] == 1) {
				return false;
			}
		}

		return true;
	}

	private void nQueen(int[][] mat, int r) {
		if (r == mat.length) {
			count++;
			return;
		}
		for (int i = 0; i < mat.length; i++) {
			if (isSafe(mat, r, i)) {
				mat[r][i] = 1;
				nQueen(mat, r + 1);
				mat[r][i] = 0;
			}
		}
	}
}
