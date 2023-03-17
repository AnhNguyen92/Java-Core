package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1475. Final Prices With a Special Discount in a Shop
 */
public class FinalPricesWithASpecialDiscountInAShop {
	public int[] finalPrices(int[] prices) {
		int[] ans = new int[prices.length];
		ans[prices.length - 1] = prices[prices.length - 1];
		for (int i = 0; i < prices.length - 1; i++) {
			int a = 0;
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] <= prices[i]) {
					a = prices[j];
					break;
				}
			}
			ans[i] = prices[i] - a;
		}
		return ans;
	}
}
