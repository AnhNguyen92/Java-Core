package javacore.algorithm.leetcode.under1900;

/*
 * LeetCode 1886. Determine Whether Matrix Can Be Obtained By Rotation
 */
public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        if (equals(mat, target)) {
            return true;
        }
        int r = mat.length;
        int[][] temp = new int[r][r];
        int swap = 1;
        for (int ii = 1; ii <= 3; ii++) {
            swapArray(mat, r, temp, swap);
            swap *= -1;
            if (swap == 1 && equals(mat, target))
                return true;
            if (swap == -1 && equals(temp, target)) {
                return true;
            }
        }

        return false;
    }

    private void swapArray(int[][] mat, int r, int[][] temp, int swap) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if (swap == 1) {
                    temp[j][r - 1 - i] = mat[i][j];
                } else {
                    mat[j][r - 1 - i] = temp[i][j];
                }
            }
        }
    }

    private boolean equals(int[][] source, int[][] compare) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                if (source[i][j] != compare[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
