package javacore.algorithm.leetcode.under1900;

import java.util.Arrays;

/*
 * LeetCode 1833. Maximum Ice Cream Bars
 */
public class MaximumIceCreamBars {
	public int maxIceCream(int[] costs, int coins) {
		Arrays.sort(costs);
		int count = 0;
		int i = 0;
		while (i < costs.length && coins >= costs[i]) {
			coins -= costs[i++];
			count++;
		}
		return count;
	}
}
