package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 37
 */
public class SudokuSolver {
	public void solveSudoku(char[][] board) {
		solveSudoku(board, 0, 0);
	}

	private boolean solveSudoku(char[][] board, int row, int col) {
		if (row == 8 && col == 9) {
			return true;
		}
		if (col == 9) {
			col = 0;
			row++;
		}
		if (board[row][col] != '.') {
			return solveSudoku(board, row, col + 1);
		}

		for (char i = '1'; i <= '9'; i++) {
			if (isSafe(board, row, col, i)) {
				board[row][col] = i;
				if (solveSudoku(board, row, col + 1))
					return true;
			}
		}
		board[row][col] = '.';

		return false;
	}

	private boolean isSafe(char[][] board, int row, int col, char num) {
		for (int j = 0; j <= 8; j++) {
			if (board[row][j] == num) {
				return false;
			}
		}

		for (int i = 0; i <= 8; i++) {
			if (board[i][col] == num) {
				return false;
			}
		}

		int startRow = row - row % 3;
		int startCol = col - col % 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[startRow + i][startCol + j] == num) {
					return false;
				}
			}
		}
		return true;
	}
}
