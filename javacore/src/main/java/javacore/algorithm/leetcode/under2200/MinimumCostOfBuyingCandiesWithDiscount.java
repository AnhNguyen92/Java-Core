package javacore.algorithm.leetcode.under2200;

import java.util.Arrays;

/*
 * LeetCode 2144. Minimum Cost of Buying Candies With Discount
 */
public class MinimumCostOfBuyingCandiesWithDiscount {
	public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int price = 0;
        int count = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            count++;
            if (count % 3 != 0) {
                price += cost[i];
            }
        }
        return price;
    }
}
