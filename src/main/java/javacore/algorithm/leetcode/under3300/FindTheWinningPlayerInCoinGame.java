package javacore.algorithm.leetcode.under3300;

/**
 * 3222. Find the Winning Player in Coin Game
 */
public class FindTheWinningPlayerInCoinGame {
    public String losingPlayer(int x, int y) {
        int res = Math.min(x, y / 4);
        return (res % 2 == 1) ? "Alice" : "Bob";
    }
}
