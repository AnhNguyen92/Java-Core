package javacore.algorithm.leetcode.under0100;

/*
 * LeetCode 74. Search a 2D Matrix
 */
public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		int i = 0;
		while (i < matrix.length && matrix[i][matrix[0].length - 1] < target) {
			i++;
		}
		if (i == matrix.length)
			return false;
		for (int j = 0; j < matrix[i].length; j++) {
			if (matrix[i][j] == target)
				return true;
		}

		return false;
	}
}
