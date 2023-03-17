package javacore.algorithm.leetcode.under1400;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/*
 * LeetCode 1329. Sort the Matrix Diagonally
 */
public class SortTheMatrixDiagonally {
	public int[][] diagonalSort(int[][] mat) {
		int rows = mat.length;
		int cols = mat[0].length;
		for (int i = 0; i < rows - 1; i++) {
			quickSort(mat, i, 0, 0, Math.min(rows - i - 1, cols - 1));
		}
		for (int i = 1; i < cols - 1; i++) {
			quickSort(mat, 0, i, 0, Math.min(rows - 1, cols - i - 1));
		}
		return mat;
	}

	public void quickSort(int[][] mat, int pinX, int pinY, int left, int right) {
		int mid = right + left >> 1;
		int pivot = mat[pinX + mid][pinY + mid];
		int i = left;
		int j = right, tmp;
		while (i <= j) {
			while (mat[pinX + i][pinY + i] < pivot)
				i++;
			while (mat[pinX + j][pinY + j] > pivot)
				j--;
			if (i < j) {
				tmp = mat[pinX + i][pinY + i];
				mat[pinX + i][pinY + i] = mat[pinX + j][pinY + j];
				mat[pinX + j][pinY + j] = tmp;
			}
			if (i <= j) {
				i++;
				j--;
			}
		}
		if (left < i - 1)
			quickSort(mat, pinX, pinY, left, i - 1);
		if (i < right)
			quickSort(mat, pinX, pinY, i, right);
	}

	public int[][] diagonalSort2(int[][] mat) {
		List<PriorityQueue<Integer>> lst = new ArrayList<>();
		for (int i = 1; i < mat.length + mat[0].length; i++) {
			lst.add(new PriorityQueue<>());
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				PriorityQueue<Integer> queue = lst.get(i - j + mat[0].length - 1);
				queue.add(mat[i][j]);
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				PriorityQueue<Integer> queue = lst.get(i - j + mat[0].length - 1);
				Integer val = queue.poll();
				mat[i][j] = val.intValue();
			}
		}
		return mat;
	}
}
