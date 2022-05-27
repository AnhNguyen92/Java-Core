package javacore.algorithm.leetcode.under1600;

/*
 * LeetCode 1582
 */
public class SpecialPositionsInABinaryMatrix {
	public int numSpecial(int[][] mat) {
        int count = 0;
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            if (row[i] == 1) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (col[j] == 1 && mat[i][j] == 1)
                        count++;
                }
            }
            
        }
        return count;
    }
}