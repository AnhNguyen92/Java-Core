package javacore.algorithm.leetcode.under0300;

/*
 * LeetCode 240
 */
public class SearchA2DMatrixII {
	public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int ii = matrix.length - 1;
        int j = 0;
        int jj = matrix[0].length;
        while (ii > 0 && jj > 0 && target < matrix[ii][jj]) {
            ii--;
            jj--;
        }
        while (i+1 < matrix.length && j+1 < matrix[0].length && target > matrix[i+1][j+1]) {
            i++;
            j++;
        }
        
        for (int k = i; k < ii; k++) {
            for (int m = 0; m < matrix[0].length; m++)
                if (matrix[k][m] > target)
                    break;
                else if (matrix[k][m] == target)
                    return true;
        }
        for (int k = 0; k < i; k++) {
            for (int m = j; m <= jj; m++)
            	if (matrix[k][m] == target)
            		return true;
            	else if (matrix[k][m] > target)
                    break;
        }
        return false;
    }
}
