package javacore.algorithm.leetcode.under0100;

/*
 * LeetCode 59
 */
public class SpiralMatrixII {
	int i = 0;
	int j = 0;
	int val = 1;
	boolean left = false;
	boolean right = true;
	boolean up = false;
	boolean down = false;

	public int[][] generateMatrix(int n) {
		int[][] arr = new int[n][n];
		do {
			if (enableMove(arr, i, j)) {
				arr[i][j] = val;
				val++;
				if (right) {
					j++;
				} else if (down) {
					i++;
				} else if (left) {
					j--;
				} else if (up) {
					i--;
				}
			} else {
				if (right) {
					right = false;
					j--;
					i++;
					if (enableMove(arr, i, j))
						down = true;
				} else if (down) {
					down = false;
					i--;
					j--;
					if (enableMove(arr, i, j))
						left = true;
				} else if (left) {
					left = false;
					j++;
					i--;
					if (enableMove(arr, i, j))
						up = true;
				} else if (up) {
					up = false;
					j++;
					i++;
					if (enableMove(arr, i, j))
						right = true;
				}
			}
		} while (right || down || left || up);

		return arr;
	}

	private boolean enableMove(int[][] arr, int i, int j) {
		return (i >= 0 && i < arr.length && j >= 0 && j < arr[0].length && arr[i][j] == 0);
	}
}