package javacore.algorithm.leetcode.under0600;

/**
 * 529. Minesweeper
 */
public class Minesweeper {
    public char[][] updateBoard(char[][] board, int[] click) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        travel(visited, board, click[0], click[1]);
        return board;
    }

    private void travel(boolean[][] visited, char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        if (!visited[i][j]) {
            if (board[i][j] == 'M')
                board[i][j] = 'X';
            else if (board[i][j] == 'E') {
                int unrevealedMine = 0;
                for (int a = Math.max(i - 1, 0); a <= Math.min(m - 1, i + 1); a++) {
                    for (int b = Math.max(j - 1, 0); b <= Math.min(n - 1, j + 1); b++)
                        if (board[a][b] == 'M')
                            unrevealedMine++;
                }
                if (unrevealedMine > 0)
                    board[i][j] = (char) (unrevealedMine + '0');
                else {
                    board[i][j] = 'B';
                    for (int a = Math.max(i - 1, 0); a <= Math.min(m - 1, i + 1); a++)
                        for (int b = Math.max(j - 1, 0); b <= Math.min(n - 1, j + 1); b++)
                            travel(visited, board, a, b);
                }
            }
        }
    }
}
