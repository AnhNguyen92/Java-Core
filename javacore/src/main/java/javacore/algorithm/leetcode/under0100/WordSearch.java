package javacore.algorithm.leetcode.under0100;

/*
 * LeetCode 79
 */
public class WordSearch {
	public boolean exist(char[][] board, String word) {
		char c = word.charAt(0);
		int m = board.length;
		int n = board[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == c && match(board, m, n, i, j, word, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean match(char[][] board, int m, int n, int i, int j, String word, int k) {
		if (k == word.length()) {
			return true;
		}
		if ((j == n) || (i == m) || (i < 0) || (j < 0) || board[i][j] != word.charAt(k)) {
			return false;
		}
		char c = board[i][j];
		board[i][j] = '1';
		boolean res = match(board, m, n, i, j + 1, word, k + 1) || match(board, m, n, i + 1, j, word, k + 1)
				|| match(board, m, n, i - 1, j, word, k + 1) || match(board, m, n, i, j - 1, word, k + 1);
		board[i][j] = c;
		return res;
	}
}
