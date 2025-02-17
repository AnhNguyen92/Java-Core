package javacore.algorithm.leetcode.under3500;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 3446. Sort Matrix by Diagonals
 */
public class SortMatrixByDiagonals {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int i, j, k, idx;
        List<Integer> lst;
        for (j = 1; j < n; j++) {
            lst = new ArrayList<>();
            i = 0; k = j;
            while (i < n && k < n) {
                lst.add(grid[i++][k++]);
            }
            Collections.sort(lst);
            i = 0; k = j; idx = 0;
            while (i < n && k < n) {
                grid[i++][k++] = lst.get(idx++);
            }
        }
        for (j = n-1; j >= 0; j--) {
            lst = new ArrayList<>();
            i = n-1; k = j;
            while (i >= 0 && k >= 0) {
                lst.add(grid[i--][k--]);
            }
            Collections.sort(lst);
            i = n-1; k = j; idx = 0;
            while (i >= 0 && k >= 0) {
                grid[i--][k--] = lst.get(idx++);
            }
        }
        return grid;
    }
}
