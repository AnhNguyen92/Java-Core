package javacore.algorithm.leetcode.under1800;

import java.util.Arrays;

/**
 * 1765. Map of Highest Peak
 */
public class MapOfHighestPeak {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] arr = new int[m][n];
        for (int[] ar : arr)
            Arrays.fill(ar, Integer.MAX_VALUE);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    travel(arr, isWater, i, j, i, j);
                }
            }
        }
        return arr;
    }

    private void travel(int[][] arr, int[][] isWater, int i, int j, int x, int y) {
        int diff = Math.abs(x - i) + Math.abs(y - j);
        if (diff < arr[x][y]) {
            arr[x][y] = Math.min(arr[x][y], diff);
            if (x > 0)
                travel(arr, isWater, i, j, x - 1, y);
            if (x < arr.length - 1)
                travel(arr, isWater, i, j, x + 1, y);
            if (y > 0)
                travel(arr, isWater, i, j, x, y - 1);
            if (y < arr[0].length - 1)
                travel(arr, isWater, i, j, x, y + 1);
        }
    }
}
