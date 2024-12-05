package javacore.algorithm.leetcode.under0900;

/**
 * 861. Score After Flipping Matrix
 */
public class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    grid[i][j] ^= 1;
                }
            }
        }
        int pow = 1 << (n - 1);
        int ans = m * pow;
        for (int j = 1; j < n; j++) {
            int one = 0;
            for (int[] row : grid) {
                one +=row[j];
            }
            pow = pow >> 1;
            ans += Math.max(one, m - one) * pow;
        }
        return ans;
    }
}
