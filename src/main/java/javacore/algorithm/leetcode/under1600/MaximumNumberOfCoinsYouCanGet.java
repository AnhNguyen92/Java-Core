package javacore.algorithm.leetcode.under1600;

import java.util.Arrays;

/*
 * LeetCode 1561. Maximum Number of Coins You Can Get
 */
public class MaximumNumberOfCoinsYouCanGet {
	public int maxCoins(int[] piles) {
		Arrays.sort(piles);
		int sum = 0;
		for (int i = piles.length / 3; i < piles.length; i += 2) {
			sum += piles[i];
		}
		return sum;
	}
}
