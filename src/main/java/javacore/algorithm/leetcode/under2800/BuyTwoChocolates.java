package javacore.algorithm.leetcode.under2800;

import java.util.Arrays;

/*
 * LeetCode 2706. Buy Two Chocolates
 */
public class BuyTwoChocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if (money < prices[0] + prices[1]) {
            return money;
        }
        return money - prices[0] - prices[1];
    }
}
