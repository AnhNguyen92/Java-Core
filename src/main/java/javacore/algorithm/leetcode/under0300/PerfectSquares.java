package javacore.algorithm.leetcode.under0300;

/**
 * 279. Perfect Squares
 */
public class PerfectSquares {
    public int numSquares(int n) {
        for (int i = 0; i * i <= n; i++) {
            for (int j = i; j * j <= n; j++) {
                for (int k = j; k * k <= n; k++) {
                    for (int l = k; l * l <= n; l++) {
                        if (i * i + j * j + k * k + l * l == n) {
                            int count = 0;
                            if (i > 0) count++;
                            if (j > 0) count++;
                            if (k > 0) count++;
                            if (l > 0) count++;
                            return count;
                        }
                    }
                }
            }
        }
        return 1;
    }
}
