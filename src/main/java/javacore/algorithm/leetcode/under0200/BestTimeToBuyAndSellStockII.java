package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 122. Best Time to Buy and Sell Stock II
 */
public class BestTimeToBuyAndSellStockII {
	public int maxProfit(int[] prices) {
		int sum = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] < prices[i + 1]) {
				sum += prices[i + 1] - prices[i];
			}
		}
		return sum;
	}
}
