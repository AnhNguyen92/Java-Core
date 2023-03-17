package javacore.algorithm.leetcode.under0500;

/*
 * LeetCode 441. Arranging Coins
 */
public class ArrangingCoins {
	public int arrangeCoins(int n) {
		return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
	}
}
