package javacore.algorithm.leetcode.under3100;

import java.util.TreeMap;

/**
 * 3044. Most Frequent Prime
 */
public class MostFrequentPrime {
    TreeMap<Integer, Integer> map = new TreeMap<>();

    public int mostFrequentPrime(int[][] mat) {
        int m = mat.length;;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                for (int k = 1; k <= 8; k++)
                    genNumber(mat, m, n, i, j, k, 0);
        }
        if (!map.isEmpty()) {
            return map.firstKey();
        }

        return -1;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    private void genNumber(int[][] mat, int m, int n, int i, int j, int dir, int x) {
        if (dir == 1) { // j++
            x = x * 10 + mat[i][j];
            if (x > 10 && isPrime(x)) {
                map.merge(x, 1, Integer::sum);
            }
            if (j + 1 < n) {
                genNumber(mat, m, n, i, j+1, dir, x);
            }
        } else if (dir == 2) { // i++
            x = x * 10 + mat[i][j];
            if (x > 10 && isPrime(x)) {
                map.merge(x, 1, Integer::sum);
            }
            if (i + 1 < m) {
                genNumber(mat, m, n, i+1, j, dir, x);
            }
        } else if (dir == 3) { // j--
            x = x * 10 + mat[i][j];
            if (x > 10 && isPrime(x)) {
                map.merge(x, 1, Integer::sum);
            }
            if (j > 0) {
                genNumber(mat, m, n, i, j-1, dir, x);
            }
        } else if (dir == 4) { // i--
            x = x * 10 + mat[i][j];
            if (x > 10 && isPrime(x)) {
                map.merge(x, 1, Integer::sum);
            }
            if (i > 0) {
                genNumber(mat, m, n, i-1, j, dir, x);
            }
        } else if (dir == 5) { // i++, j++
            x = x * 10 + mat[i][j];
            if (x > 10 && isPrime(x)) {
                map.merge(x, 1, Integer::sum);
            }
            if (i + 1 < m && j + 1 < n) {
                genNumber(mat, m, n, i+1, j+1, dir, x);
            }
        } else if (dir == 6) { // i--, j--
            x = x * 10 + mat[i][j];
            if (x > 10 && isPrime(x)) {
                map.merge(x, 1, Integer::sum);
            }
            if (i > 0 && j > 0) {
                genNumber(mat, m, n, i-1, j-1, dir, x);
            }
        } else if (dir == 7) { // i++, j--
            x = x * 10 + mat[i][j];
            if (x > 10 && isPrime(x)) {
                map.merge(x, 1, Integer::sum);
            }
            if (i + 1 < m && j > 0) {
                genNumber(mat, m, n, i+1, j-1, dir, x);
            }
        } else if (dir == 8) { // i--, j++
            x = x * 10 + mat[i][j];
            if (x > 10 && isPrime(x)) {
                map.merge(x, 1, Integer::sum);
            }
            if (i > 0 && j + 1 < n) {
                genNumber(mat, m, n, i-1, j+1, dir, x);
            }
        }
    }
}
