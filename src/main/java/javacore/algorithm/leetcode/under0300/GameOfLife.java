package javacore.algorithm.leetcode.under0300;

/**
 * 289. Game of Life
 */
public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = toLife(board, m, n, i, j);
            }
        }
        for (int i = 0; i < m; i++) {
            System.arraycopy(ans[i], 0, board[i], 0, n);
        }
    }

    private int toLife(int[][] arr, int m, int n, int i, int j) {
        int l = -arr[i][j];
        for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
            for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
                l += arr[x][y];
            }
        }
        if (arr[i][j] == 0)
            return l == 3 ? 1 : 0;
        return (l == 2 || l == 3) ? 1 : 0;
    }
}
