package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 49
 */
public class CountIntegersWithEvenDigitSum {
	public int countEven(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (evenNo(i)) {
				count++;
			}
		}
		return count;
	}

	private boolean evenNo(int i) {
		int sum = 0;
		while (i > 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum % 2 == 0;
	}
}
