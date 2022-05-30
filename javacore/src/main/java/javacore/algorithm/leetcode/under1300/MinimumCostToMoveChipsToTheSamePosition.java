package javacore.algorithm.leetcode.under1300;

/*
 * Leetcode 1217
 */
public class MinimumCostToMoveChipsToTheSamePosition {
	public int minCostToMoveChips(int[] position) {
		int odd = 0;
		int even = 0;
		for (int i : position) {
			if (i % 2 == 0)
				even++;
			else
				odd++;
		}
		return Math.min(even, odd);
	}
}
