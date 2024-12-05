package javacore.algorithm.leetcode.under3400;

/**
 * 3360. Stone Removal Game
 */
public class StoneRemovalGame {
    public boolean canAliceWin(int n) {
        return canWin(n, 10, true);
    }

    public boolean canWin(int n, int turn, boolean isWinner) {
        if (n < turn) return !isWinner;
        if (n == turn) return isWinner;
        return canWin(n - turn, turn - 1, !isWinner);
    }
}
