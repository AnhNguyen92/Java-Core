package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2379. Minimum Recolors to Get K Consecutive Black Blocks
 */
public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
	public int minimumRecolors(String blocks, int k) {
		int count = 0;
		for (int i = 0; i < k; i++) {
			if (blocks.charAt(i) == 'W') {
				count++;
			}
		}
		int max = count;
		for (int i = k; i < blocks.length(); i++) {
			if (blocks.charAt(i) == 'W') {
				count++;
			}
			if (blocks.charAt(i - k) == 'W') {
				count--;
			}
			if (max > count) {
				max--;
			}
		}
		return max;
	}
}
