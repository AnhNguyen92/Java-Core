package javacore.algorithm.leetcode.under1300;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode 1275
 */
public class FindWinnerOnATicTacToeGame {
	public String tictactoe(int[][] moves) {
        if (hasWinner(moves, 0)) {
            return "A";
        }
        if (hasWinner(moves, 1)) {
            return "B";
        }
        if (moves.length == 9) {
            return "Draw";
        }
        return "Pending";
    }
    
    private boolean hasWinner(int[][] moves, int start) {
        List<Integer> lst = new ArrayList<>();
        for (int i = start; i < moves.length; i += 2) {
            lst.add(moves[i][0] * 10 + moves[i][1]);
        }
        if (   (lst.contains(0) && lst.contains(1) && lst.contains(2)) //
            || (lst.contains(0) && lst.contains(10) && lst.contains(20)) //
            || (lst.contains(0) && lst.contains(11) && lst.contains(22)) //
            || (lst.contains(1) && lst.contains(11) && lst.contains(21)) //
            || (lst.contains(2) && lst.contains(12) && lst.contains(22)) //
            || (lst.contains(10) && lst.contains(11) && lst.contains(12)) //
            || (lst.contains(20) && lst.contains(21) && lst.contains(22)) //
            || (lst.contains(2) && lst.contains(11) && lst.contains(20)) //
           ) 
            return true;
        return false;
    }
}
