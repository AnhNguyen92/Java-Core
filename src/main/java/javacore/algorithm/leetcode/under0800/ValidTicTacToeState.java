package javacore.algorithm.leetcode.under0800;

/**
 * 794. Valid Tic-Tac-Toe State
 */
public class ValidTicTacToeState {
    public boolean validTicTacToe(String[] board) {
        int x = 0;
        int o = 0;
        for (String row : board) {
            for (char c : row.toCharArray())
                if ('X' == c)
                    x++;
                else if ('O' == c)
                    o++;
        }
        if (x < o || x - o > 1)
            return false;
        char s0 = board[0].charAt(0);
        char s1 = board[1].charAt(1);
        char s2 = board[2].charAt(2);
        char winner = '\u0000';
        if (s0 == board[0].charAt(1) && s0 == board[0].charAt(2)) {
            winner = s0;
        }
        if (s0 == board[1].charAt(0) && s0 == board[2].charAt(0)) {
            winner = s0;
        }
        if (s0 == board[1].charAt(1) && s0 == s2) {
            winner = s0;
        }
        if (s1 == board[0].charAt(1) && s1 == board[2].charAt(1)) {
            if (winner != '\u0000' && winner != s1)
                return false;
            winner = s1;
        }
        if (s1 == board[1].charAt(0) && s1 == board[1].charAt(2)) {
            if (winner != '\u0000' && winner != s1)
                return false;
            winner = s1;
        }
        if (s1 == board[0].charAt(2) && s1 == board[2].charAt(0)) {
            if (winner != '\u0000' && winner != s1)
                return false;
            winner = s1;
        }
        if (s2 == board[2].charAt(0) && s2 == board[2].charAt(1)) {
            if (winner != '\u0000' && winner != s2)
                return false;
            winner = s2;
        }
        if (s2 == board[0].charAt(2) && s2 == board[1].charAt(2)) {
            if (winner != '\u0000' && winner != s2)
                return false;
            winner = s2;
        }
        if ((x == o && winner == 'X') || (x > o && winner == 'O'))
            return false;

        return true;
    }
}
