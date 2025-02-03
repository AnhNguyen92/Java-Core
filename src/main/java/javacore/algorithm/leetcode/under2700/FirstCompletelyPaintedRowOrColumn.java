package javacore.algorithm.leetcode.under2700;

import java.util.HashMap;
import java.util.Map;

/**
 * 2661. First Completely Painted Row or Column
 */
public class FirstCompletelyPaintedRowOrColumn {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();
        Map<Integer, int[]> map = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.put(mat[i][j], new int[]{ i, j });
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int[] ar = map.get(arr[i]);
            rows.merge(ar[0], 1, Integer::sum);
            if (rows.get(ar[0]) == n)
                return i;

            cols.merge(ar[1], 1, Integer::sum);
            if (cols.get(ar[1]) == m)
                return i;
        }
        return arr.length - 1;
    }
}
