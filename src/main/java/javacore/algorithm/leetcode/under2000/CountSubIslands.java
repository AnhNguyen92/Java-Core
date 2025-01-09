package javacore.algorithm.leetcode.under2000;

/**
 * 1905. Count Sub Islands
 */
public class CountSubIslands {
    boolean valid = true;

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        boolean[][] visited = new boolean[grid2.length][grid2[0].length];
        int count = 0;
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[0].length; j++) {
                if (grid2[i][j] == 1 && !visited[i][j]) {
                    valid = true;
                    travel(visited, grid1, grid2, i, j);
                    if (valid) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private void travel(boolean[][] visited, int[][] grid1, int[][] grid2, int i, int j) {
        visited[i][j] = true;
        if (grid1[i][j] == 0) {
            valid = false;
        }
        if (i > 0 && !visited[i - 1][j] && grid2[i - 1][j] == 1)
            travel(visited, grid1, grid2, i - 1, j);
        if (i + 1 < grid2.length && !visited[i + 1][j] && grid2[i + 1][j] == 1)
            travel(visited, grid1, grid2, i + 1, j);
        if (j > 0 && !visited[i][j - 1] && grid2[i][j - 1] == 1)
            travel(visited, grid1, grid2, i, j - 1);
        if (j + 1 < grid2[0].length && !visited[i][j + 1] && grid2[i][j + 1] == 1)
            travel(visited, grid1, grid2, i, j + 1);
    }
}
