package javacore.algorithm.leetcode.under500;

/*
 * Leetcode 441
 */
public class ArrangingCoins {
	public int arrangeCoins(int n) {
		return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
	}
}
