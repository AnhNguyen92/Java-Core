package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2303. Calculate Amount Paid in Taxes
 */
public class CalculateAmountPaidInTaxes {

	public double calculateTax(int[][] brackets, int income) {
		double ans = 0.0;
		int min;
		for (int i = 0; i < brackets.length; i++) {
			min = i > 0 ? (brackets[i][0] - brackets[i - 1][0]) : brackets[0][0];
			min = Math.min(min, income);
			ans += min * brackets[i][1];
			income -= min;
		}
		return ans / 100;
	}
}
