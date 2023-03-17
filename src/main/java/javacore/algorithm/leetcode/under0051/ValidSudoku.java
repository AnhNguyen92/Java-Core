package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 36. Valid Sudoku
 */
public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {
		boolean isValidRowAndCol = validByRowAndCol(board);
		if (isValidRowAndCol) {
			return validByRange(board);
		}
		return false;
	}

	private boolean validByRange(char[][] board) {
		Map<Integer, List<Character>> rangeMap;
		for (int ii = 0; ii < board.length; ii += 3) {
			for (int jj = 0; jj < board[0].length; jj += 3) {
				rangeMap = new HashMap<>();
				for (int i = ii; i < ii + 3; i++) {
					for (int j = jj; j < jj + 3; j++) {
						if (board[i][j] >= '1' && board[i][j] <= '9') {
							List<Character> rItem = rangeMap.computeIfAbsent(ii * 10 + jj, k -> new ArrayList<Character>());
							if (rItem.contains(board[i][j])) {
								return false;
							}
							rItem.add(board[i][j]);
						}
					}
				}
			}
		}

		return true;
	}

	private boolean validByRowAndCol(char[][] board) {
		Map<Integer, List<Character>> rMap = new HashMap<>();
		Map<Integer, List<Character>> cMap = new HashMap<>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] >= '1' && board[i][j] <= '9') {
					List<Character> rItem = rMap.computeIfAbsent(i, k -> new ArrayList<Character>());
					if (rItem.contains(board[i][j])) {
						return false;
					}
					rItem.add(board[i][j]);
					List<Character> cItem = cMap.computeIfAbsent(j, k -> new ArrayList<Character>());
					if (cItem.contains(board[i][j])) {
						return false;
					}
					cItem.add(board[i][j]);
				}
			}
		}
		return true;
	}
}
