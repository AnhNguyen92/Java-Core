package javacore.algorithm.leetcode.under0400;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 304. Range Sum Query 2D - Immutable
 */
public class RangeSumQuery2DImmutable {
	class NumMatrix {
		int[][] arr;
		Map<String, Integer> map = new HashMap<>();

		public NumMatrix(int[][] matrix) {
			arr = matrix;
		}

		public int sumRegion(int row1, int col1, int row2, int col2) {
			String key = String.valueOf(row1) + col1 + row2 + col2;
			if (map.containsKey(key))
	            return map.get(key);
			int sum = 0;
			for (int i = row1; i <= row2; i++) {
				for (int j = col1; j <= col2; j++) {
					sum += arr[i][j];
				}
			}
			return sum;
		}
	}

	/**
	 * Your NumMatrix object will be instantiated and called as such: NumMatrix obj
	 * = new NumMatrix(matrix); int param_1 = obj.sumRegion(row1,col1,row2,col2);
	 */
}
