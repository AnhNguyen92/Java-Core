package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 999. Available Captures for Rook
 */
public class AvailableCapturesForRook {
	public int numRookCaptures(char[][] board) {
        int row = 0;
        int col = 0;
        boolean found = false;
        for (int i = 0; i < 8; i++) {
            if (!found) {
                for (int j = 0; j < 8; j++) {
                    if (board[i][j] == 'R') {
                        row = i;
                        col = j;
                        found = true;
                        break;
                    }
                }
            } else {
                break;
            }  
        }
        int count = 0;
        for (int i = row + 1; i < 8; i++) {
            if (board[i][col] == 'p') {
                count++;
                break;
            } else if (board[i][col] == 'B') {
                break;
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'p') {
                count++;
                break;
            } else if (board[i][col] == 'B') {
                break;
            }
        }
        for (int j = col + 1; j < 8; j++) {
            if (board[row][j] == 'p') {
                count++;
                break;
            } else if (board[row][j] == 'B') {
                break;
            }
        }
        for (int j = col - 1; j >= 0; j--) {
            if (board[row][j] == 'p') {
                count++;
                break;
            } else if (board[row][j] == 'B')
                break;
        }
        return count;
    }
}
