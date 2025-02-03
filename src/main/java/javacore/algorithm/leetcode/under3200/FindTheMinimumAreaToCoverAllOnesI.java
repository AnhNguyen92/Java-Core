package javacore.algorithm.leetcode.under3200;

/**
 * 3195. Find the Minimum Area to Cover All Ones I
 */
public class FindTheMinimumAreaToCoverAllOnesI {
    public int minimumArea(int[][] grid) {
        int lr = 1000;
        int mr = 0;
        int lc = 1000;
        int mc = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1) {
                    lr = Math.min(lr, i);
                    mr = Math.max(mr, i);
                    lc = Math.min(lc, j);
                    mc = Math.max(mc, j);
                }

        return (mr - lr + 1) * (mc - lc + 1);
    }
}
