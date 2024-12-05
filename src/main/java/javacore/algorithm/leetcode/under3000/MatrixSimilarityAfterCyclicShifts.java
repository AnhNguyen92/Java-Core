package javacore.algorithm.leetcode.under3000;

/**
 * 2946. Matrix Similarity After Cyclic Shifts
 */
public class MatrixSimilarityAfterCyclicShifts {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        k = k % n;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = mat[i][(n + j - k) % n];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != mat[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
