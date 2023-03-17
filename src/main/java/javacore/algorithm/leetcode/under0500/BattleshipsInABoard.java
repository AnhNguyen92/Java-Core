package javacore.algorithm.leetcode.under0500;

/*
 * LeetCode 419. Battleships in a Board
 */
public class BattleshipsInABoard {
	int ans = 0;

    public int countBattleships(char[][] board) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!visited[i][j]) {
                    if (board[i][j] == 'X') {
                        travel(visited, board, i, j, true);
                    } else {
                        visited[i][j] = true;
                    }
                }
            }
        }
        
        return  ans;
    }

    private void travel(boolean[][] visited, char[][] board, int i, int j, boolean count) {
        if (!visited[i][j] && board[i][j] == 'X') {
            visited[i][j] = true;
            if (count) {
                ans++;
            } 
            if (i > 0 && !visited[i-1][j] && board[i-1][j] == 'X') {
                travel(visited, board, i - 1, j, false);
            }
            if (i + 1 < board.length && !visited[i+1][j] && board[i+1][j] == 'X') {
                travel(visited, board, i + 1, j, false);
            }
            if (j + 1 < board[0].length && !visited[i][j+1] && board[i][j+1] == 'X') {
                travel(visited, board, i, j+1, false);
            }
            if (j > 0 && !visited[i][j-1] && board[i][j-1] == 'X') {
                travel(visited, board, i, j-1, false);
            }
        }
    }

}
