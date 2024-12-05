package javacore.algorithm.leetcode.under2300;

/**
 * 2257. Count Unguarded Cells in the Grid
 */
public class CountUnguardedCellsInTheGrid {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] arr = new int[m][n];
        for (int[] wall : walls) {
            arr[wall[0]][wall[1]] = 2;
        }
        for (int[] guard : guards) {
            arr[guard[0]][guard[1]] = 2;
        }
        for (int[] guard : guards) {
            for (int i = guard[0] - 1; i >= 0; i--) {
                if (arr[i][guard[1]] == 2)  break;
                arr[i][guard[1]] = 1;
            }
            for (int i = guard[0] + 1; i < m; i++) {
                if (arr[i][guard[1]] == 2)  break;
                arr[i][guard[1]] = 1;
            }
            for (int j = guard[1] + 1; j < n; j++) {
                if (arr[guard[0]][j] == 2)  break;
                arr[guard[0]][j] = 1;
            }
            for (int j = guard[1] - 1; j >= 0; j--) {
                if (arr[guard[0]][j] == 2)  break;
                arr[guard[0]][j] = 1;
            }
        }

        int notGuard = 0;
        for (int[] row : arr) {
            for (int j = 0; j < n; j++) {
                if (row[j] == 0)    notGuard++;
            }
        }
        return notGuard;
    }
}
