package javacore.algorithm.leetcode.under0300;

/**
 * 221. Maximal Square
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    count = 1;
                    for (int k = 1; k <= m - 1 - i && i + k < m && j + k < n; k++) {
                        boolean valid = true;
                        for (int x = 0; x <= k; x++) {
                            if (matrix[i + x][j + k] == '0') {
                                valid = false;
                                break;
                            }
                        }
                        for (int x = 0; x <= k; x++) {
                            if (matrix[i + k][j + x] == '0') {
                                valid = false;
                                break;
                            }
                        }
                        if (valid) count++;
                        else break;
                    }
                    if (max < count * count) {
                        max = count * count;
                    }
                }
            }
        }
        return max;
    }
}
