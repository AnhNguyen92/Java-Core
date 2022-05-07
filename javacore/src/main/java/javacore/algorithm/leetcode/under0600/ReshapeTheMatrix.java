package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 566
*/
public class ReshapeTheMatrix {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (( r * c != mat.length * mat[0].length) || (r == mat.length && c == mat[0].length) ) {
            return mat;
        }
        int i = 0;
        int j = 0;
        int[][] arr = new int[r][c];
        for (int k = 0; k < mat.length; k++) {
            for (int l = 0; l < mat[0].length; l++) {
                arr[i][j] = mat[k][l];
                j++;
                if (j == c) {
                    i++;
                    j = 0;
                }
            }
        }
        return arr;
    }
}
