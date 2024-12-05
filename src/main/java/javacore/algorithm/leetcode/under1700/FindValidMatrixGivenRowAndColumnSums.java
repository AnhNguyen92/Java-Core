package javacore.algorithm.leetcode.under1700;

/**
 * 1605. Find Valid Matrix Given Row and Column Sums
 */
public class FindValidMatrixGivenRowAndColumnSums {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int i = 0;
        int j = 0;
        int[][] ans = new int[m][n];
        while (i < m && j < n) {
            ans[i][j] = Math.min(rowSum[i], colSum[j]);
            colSum[j] -= ans[i][j];
            rowSum[i] -= ans[i][j];
            if (rowSum[i] == 0) {
                i++;
            }
            if (colSum[j] == 0) {
                j++;
            }
        }
        return ans;
    }
}
