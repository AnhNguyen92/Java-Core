package javacore.algorithm.leetcode.under2700;

/*
 * LeetCode 2652. Sum Multiples
 */
public class SumMultiples {
	public int sumOfMultiples(int n) {
		int sum = 0;
		for (int i = 3; i <= n; i += 3) {
			sum += i;
		}
		for (int i = 5; i <= n; i += 5) {
			if (i % 3 != 0)
				sum += i;
		}
		for (int i = 7; i <= n; i += 7) {
			if (i % 3 != 0 && i % 5 != 0)
				sum += i;
		}
		return sum;
	}
}
