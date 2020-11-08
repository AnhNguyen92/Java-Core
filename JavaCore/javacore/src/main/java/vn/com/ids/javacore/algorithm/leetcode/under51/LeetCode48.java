package vn.com.ids.javacore.algorithm.leetcode.under51;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeetCode48 {
	private static Logger logger = LoggerFactory.getLogger(LeetCode48.class);

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(matrix);
		displayMatrix(matrix);
	}

	private static void displayMatrix(int[][] matrix) {
		int col = matrix[0].length;
		int row = matrix.length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			logger.info("");
		}
	}

	public static void rotate(int[][] matrix) {
		int temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				
			}
		}
	}

}
