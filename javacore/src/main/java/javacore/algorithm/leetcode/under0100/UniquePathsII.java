package javacore.algorithm.leetcode.under0100;

/*
 * Leetcode 63. Unique Paths II
 */
public class UniquePathsII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        obstacleGrid[0][0] ^= 1;
        for (int i = 1; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] == 1) {
                obstacleGrid[0][i] = 0;
            } else {
                obstacleGrid[0][i] = obstacleGrid[0][i - 1];
            }
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 0) {
                    obstacleGrid[i][j] = (j == 0) ? obstacleGrid[i - 1][j] : (obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1]);
                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }
        return  obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
