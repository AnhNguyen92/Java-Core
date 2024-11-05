package javacore.algorithm.leetcode.under3200;

/**
 * 3127. Make a Square with the Same Color
 */
public class MakeASquareWithTheSameColor {
    public boolean canMakeSquare(char[][] grid) {
        int b = 0;
        int w = 0;
        for (int i = 0; i < 2; i++) {
            b = 0;
            w = 0;
            for (int j = 0; j < 2; j++) {
                if (grid[i][j] == 'B') b++;
                else w++;
                if (grid[i][j + 1] == 'B') b++;
                else w++;
                if (grid[i + 1][j] == 'B') b++;
                else w++;
                if (grid[i + 1][j + 1] == 'B') b++;
                else w++;
                if (b != w)
                    return true;
            }
            //System.out.println(i + " " + " " + b + " " + w);

        }
        return false;
    }
}
