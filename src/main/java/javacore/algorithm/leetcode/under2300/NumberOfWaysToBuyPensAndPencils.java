package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2240. Number of Ways to Buy Pens and Pencils
 */
public class NumberOfWaysToBuyPensAndPencils {
	public long waysToBuyPensPencils(int total, int cost1, int cost2) {
		long count = 0;
		for (int i = 0; i <= total; i += cost1) {
			count += (total - i) / cost2 + 1;
		}
		return count;
	}
}
