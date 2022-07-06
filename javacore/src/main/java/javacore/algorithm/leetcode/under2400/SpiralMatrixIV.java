package javacore.algorithm.leetcode.under2400;

import java.util.Arrays;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 2326
 */
public class SpiralMatrixIV {
	public int[][] spiralMatrix(int m, int n, ListNode head) {
		int[][] arr = new int[m][n];
		for (int[] a : arr) {
			Arrays.fill(a, -1);
		}
		int i = 0;
		int j = 0;
		int direct = 1;
		while (head != null && arr[i][j] == -1) {
			arr[i][j] = head.val;
			if (direct == 1) {
				if (j < n - 1 && arr[i][j + 1] == -1) {
					j++;
				} else {
					direct = 2;
					i++;
				}
			} else if (direct == 2) {
				if (i < m - 1 && arr[i + 1][j] == -1) {
					i++;
				} else {
					j--;
					direct = -1;
				}

			} else if (direct == -1) {
				if (j > 0 && arr[i][j - 1] == -1) {
					j--;
				} else {
					i--;
					direct = -2;
				}

			} else {
				if (i > 0 && arr[i - 1][j] == -1) {
					i--;
				} else {
					j++;
					direct = 1;
				}
			}
			head = head.next;
		}

		return arr;
	}
}
