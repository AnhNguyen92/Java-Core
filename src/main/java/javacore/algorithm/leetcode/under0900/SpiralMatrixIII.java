package javacore.algorithm.leetcode.under0900;

/**
 * 885. Spiral Matrix III
 */
public class SpiralMatrixIII {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int loop = Math.max(rStart, Math.max(rows - rStart, Math.max(cStart, cols - cStart)));
        int[][] res = new int[rows * cols][2];
        res[0] = new int[]{rStart, cStart};
        int z = 1;
        for (int i = 0; i <= loop; i++) {
            for (int j = 1; j <= 2 * i + 1; j++) {
                cStart++;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols)
                    res[z++] = new int[]{rStart, cStart};
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                rStart++;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols)
                    res[z++] = new int[]{rStart, cStart};
            }
            for (int j = 1; j <= 2 * i + 2; j++) {
                cStart--;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols)
                    res[z++] = new int[]{rStart, cStart};
            }
            for (int j = 1; j <= 2 * i + 2; j++) {
                rStart--;
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols)
                    res[z++] = new int[]{rStart, cStart};
            }
        }
        return res;
    }
}
