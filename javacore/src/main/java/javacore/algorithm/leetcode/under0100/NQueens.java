package javacore.algorithm.leetcode.under0100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 51. N-Queens
 */
public class NQueens {
	List<List<String>> ans = new ArrayList<>();

	public List<List<String>> solveNQueens(int n) {
		char[][] mat = new char[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(mat[i], '.');
		}
		nQueen(mat, 0);
		return ans;
	}

	private boolean isSafe(char[][] mat, int r, int c) {
		for (int i = 0; i < r; i++) {
			if (mat[i][c] == 'Q') {
				return false;
			}
		}
		for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
			if (mat[i][j] == 'Q') {
				return false;
			}
		}
		for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++) {
			if (mat[i][j] == 'Q') {
				return false;
			}
		}

		return true;
	}

	private void addSolution(char[][] mat) {
		List<String> item = new ArrayList<>();
		for (char[] chars : mat) {
			item.add(new String(chars));
		}
		ans.add(item);
	}

	private void nQueen(char[][] mat, int r) {
		if (r == mat.length) {
			addSolution(mat);
			return;
		}
		for (int i = 0; i < mat.length; i++) {
			if (isSafe(mat, r, i)) {
				mat[r][i] = 'Q';
				nQueen(mat, r + 1);
				mat[r][i] = '.';
			}
		}
	}
}
