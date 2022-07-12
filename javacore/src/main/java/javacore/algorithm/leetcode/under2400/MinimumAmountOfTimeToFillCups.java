package javacore.algorithm.leetcode.under2400;

import java.util.Arrays;

/*
 * LeetCode 2335
 */
public class MinimumAmountOfTimeToFillCups {

	public int fillCups(int[] amount) {
		int time = 0;
		while (amount[2] > 0) {
			amount[2]--;
			amount[1]--;
			time++;
			Arrays.sort(amount);
		}
		return time;
	}

}
