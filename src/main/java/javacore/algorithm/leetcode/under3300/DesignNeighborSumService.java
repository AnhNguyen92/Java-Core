package javacore.algorithm.leetcode.under3300;

/**
 * 3242. Design Neighbor Sum Service
 */
public class DesignNeighborSumService {
    class NeighborSum {
        int[] diagonal;
        int[] adjacent;

        public NeighborSum(int[][] grid) {
            diagonal = new int[grid.length * grid[0].length];
            adjacent = new int[diagonal.length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    diagonal[grid[i][j]] = diagonalSum(grid, i, j);
                    adjacent[grid[i][j]] = adjacentSum(grid, i, j);
                }
            }
        }

        public int adjacentSum(int value) {
            return adjacent[value];
        }

        public int diagonalSum(int value) {
            return diagonal[value];
        }

        private int adjacentSum(int[][] grid, int i, int j) {
            int sum = 0;
            if (i > 0)  sum += grid[i - 1][j];
            if (i < grid.length - 1)  sum += grid[i + 1][j];
            if (j > 0)  sum += grid[i][j - 1];
            if (j < grid[i].length - 1)  sum += grid[i][j + 1];

            return sum;
        }

        private int diagonalSum(int[][] grid, int i, int j) {
            int sum = 0;
            if (i > 0) {
                if (j > 0)                   sum += grid[i - 1][j - 1];
                if (j < grid[i].length - 1)  sum += grid[i - 1][j + 1];

            }
            if (i < grid.length - 1) {
                if (j > 0)                   sum += grid[i + 1][j - 1];
                if (j < grid[i].length - 1)  sum += grid[i + 1][j + 1];
            }

            return sum;
        }

    }

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
}
