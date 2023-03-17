package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2078. Two Furthest Houses With Different Colors
 */
public class TwoFurthestHousesWithDifferentColors {

	public int maxDistance(int[] colors) {
		int i = 0;
		int forward = colors.length - 1;
		while (forward > 0 && colors[forward] == colors[i]) {
			forward--;
		}
		int backword = 0;
		i = colors.length - 1;
		while (backword < colors.length - 1 && colors[backword] == colors[i]) {
			backword++;
		}
		return Math.max(forward, colors.length - 1 - backword);
	}

}
