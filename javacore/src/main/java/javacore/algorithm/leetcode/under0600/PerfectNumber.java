package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 507. Perfect Number
 */
public class PerfectNumber {
	public boolean checkPerfectNumber(int num) {
		if (num <= 1)
			return false;
		int sum = 1;
		for (int i = 2; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0) {
				sum += num / i + i;
			}
		}
		return sum == num;
	}
}
