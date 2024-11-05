package javacore.algorithm.leetcode.under0900;

/*
 * 840. Magic Squares In Grid
 */
public class MagicSquaresInGrid {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[i].length - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isMagicSquare(int[][] matrix, int row, int col) {
        boolean[] seen = new boolean[10];
        int magicSum = 15;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 3; j++) {
                int value = matrix[i+row][j+col];
                if (value < 1 || value > 9 || seen[value]) {
                    return false;
                }
                seen[value] = true;
                rowSum += value;
                colSum += matrix[j+row][i+col];
            }
            if (rowSum != magicSum || colSum != magicSum) {
                return false;
            }
            sum1 += matrix[i+row][i+col];
            sum2 += matrix[i+row][2 - i+col];
        }
        return sum1 == magicSum && sum2 == magicSum;
    }
}
