package javacore.algorithm.leetcode.under1300;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1222. Queens That Can Attack the King
 */
public class QueensThatCanAttackTheKing {
	List<List<Integer>> ans = new ArrayList<>();

	public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
		int[][] arr = new int[8][8];
		for (int[] queen : queens) {
			arr[queen[0]][queen[1]] = 1;
		}

		for (int i = king[0] - 1, j = king[1] - 1; i >= 0 && j >= 0; i--, j--) {
			if (arr[i][j] == 1) {
				addItem(i, j);
				break;
			}
		}
		for (int i = king[0] - 1; i >= 0; i--) {
			if (arr[i][king[1]] == 1) {
				addItem(i, king[1]);
				break;
			}
		}
		for (int i = king[0] - 1, j = king[1] + 1; i >= 0 && j < arr.length; i--, j++) {
			if (arr[i][j] == 1) {
				addItem(i, j);
				break;
			}
		}
		for (int j = king[1] + 1; j < 8; j++) {
			if (arr[king[0]][j] == 1) {
				addItem(king[0], j);
				break;
			}
		}

		for (int i = king[0]; i < 8; i++) {
			if (arr[i][king[1]] == 1) {
				addItem(i, king[1]);
				break;
			}
		}
		for (int j = king[1]; j >= 0; j--) {
			if (arr[king[0]][j] == 1) {
				addItem(king[0], j);
				break;
			}
		}
		for (int i = king[0], j = king[1]; i < arr.length && j >= 0; i++, j--) {
			if (arr[i][j] == 1) {
				addItem(i, j);
				break;
			}
		}
		for (int i = king[0], j = king[1]; i < arr.length && j < arr.length; i++, j++) {
			if (arr[i][j] == 1) {
				addItem(i, j);
				break;
			}
		}

		return ans;
	}

	private void addItem(int i, int j) {
		List<Integer> item = new ArrayList<>();
		item.add(i);
		item.add(j);
		ans.add(item);
	}
}
