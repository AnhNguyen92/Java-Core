package javacore.algorithm.leetcode.under0500;

/**
 * 498. Diagonal Traverse
 */
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m * n];
        int i = 0;
        int j = 0;
        boolean increase = true;
        for (int k = 0; k < arr.length; k++) {
            arr[k] = mat[i][j];
            if (increase) {
                if (i == 0 || j == n - 1) {
                    if (j < n - 1)
                        j++;
                    else
                        i++;
                    increase = false;
                    continue;
                }
                j++;
                i--;

            } else {
                if (j == 0 || i == m - 1) {
                    if (i < m - 1)
                        i++;
                    else
                        j++;
                    increase = true;
                    continue;
                }
                i++;
                j--;
            }
        }
        return arr;
    }
}
