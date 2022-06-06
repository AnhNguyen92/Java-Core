package javacore.algorithm.leetcode.under0200;

public class DungeonGame {
	public int calculateMinimumHP(int[][] dungeon) {
		int m = dungeon.length;
		int n = dungeon[0].length;
		int[][] dp = new int[m][n];

		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				dp[i][j] = dungeon[i][j];
				if (i < m - 1 && j < n - 1) {
					if (dp[i][j + 1] < 0 && dp[i + 1][j] < 0)
						dp[i][j] = Math.max(dp[i][j] + dp[i][j + 1], dp[i][j] + dp[i + 1][j]);
				} else if (i == m - 1 && j < n - 1) {
					dp[i][j] += dp[i][j + 1];
				} else if (i < m - 1 && j == n - 1) {
					dp[i][j] += dp[i + 1][j];
				}
				if (dp[i][j] > 0) {
					dp[i][j] = 0;
				}
			}
		}
		return dp[0][0] < 0 ? (1 - dp[0][0]) : 1;
	}
}
