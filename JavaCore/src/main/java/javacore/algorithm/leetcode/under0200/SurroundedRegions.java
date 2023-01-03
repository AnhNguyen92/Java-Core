package javacore.algorithm.leetcode.under0200;

/*
 * Leetcode 130. Surrounded Regions
 */
public class SurroundedRegions {
	public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] flags = new boolean[m][n];
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                travel(flags, board, 0, j, m, n);
            }
            if (board[m - 1][j] == 'O') {
                travel(flags, board, m - 1, j, m, n);
            }
        }
        for (int i = 1; i < m - 1; i++) {
            if (board[i][0] == 'O') {
                travel(flags, board, i, 0, m, n);
            }
            if (board[i][n-1] == 'O') {
                travel(flags, board, i, n - 1, m, n);
            }
        }
        for (int i  = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if(!flags[i][j] && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void travel(boolean[][] flags, char[][] board, int i, int j, int m, int n) {
        flags[i][j] = true;
        if (i > 1 && !flags[i - 1][j] && board[i - 1][j] == 'O') {
            travel(flags, board, i - 1, j, m, n);
        }
        if (i < m - 1 && !flags[i + 1][j] && board[i + 1][j] == 'O') {
            travel(flags, board, i + 1, j, m, n);
        }
        if (j < n - 1 && !flags[i][j + 1] && board[i][j + 1] == 'O') {
            travel(flags, board, i, j + 1, m, n);
        }
        if (j > 1 && !flags[i][j - 1] && board[i][j - 1] == 'O') {
            travel(flags, board, i, j - 1, m, n);
        }
    }
}
