package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2428. Maximum Sum of an Hourglass
 */
public class MaximumSumOfAnHourglass {
	public int maxSum(int[][] grid) {
		int totalSum = 0;
		int sum = 0;
		for (int i = 1; i < grid.length - 1; i++) {
			for (int j = 1; j < grid[0].length - 1; j++) {
				sum = grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1] + grid[i][j] + grid[i + 1][j - 1]
						+ grid[i + 1][j] + grid[i + 1][j + 1];
				if (totalSum < sum) {
					totalSum = sum;
				}
			}
		}
		return totalSum;
	}

}
