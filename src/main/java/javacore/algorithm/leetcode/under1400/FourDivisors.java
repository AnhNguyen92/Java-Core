package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1390. Four Divisors
 */
public class FourDivisors {
	public int sumFourDivisors(int[] nums) {
		int result = 0;
		for (int num : nums) {
			if (num == 8) {
				result += 15;
				continue;
			}
			if (num < 6 || num % 4 == 0)
				continue;
			int sqrt = (int) Math.ceil(Math.sqrt(num));
			if (sqrt * sqrt == num)
				continue;

			int div = num % 2 == 0 ? 2 : 0;
			for (int i = 3; i < sqrt; i += 2) {
				if (num % i == 0) {
					if (div > 0) {
						div = 0;
						break;
					}
					div = i;
				}
			}
			if (div > 0) {
				result += 1 + div + num / div + num;
			}
		}
		return result;
	}

	public int sumFourDivisors1(int[] nums) {
		int result = 0;
		for (int num : nums) {
			int sqrt = (int) Math.ceil(Math.sqrt(num));
			if (sqrt * sqrt == num)
				continue;

			int incr = num % 2 == 0 ? 1 : 2;
			int div = 0;
			for (int i = 1 + incr; i < sqrt; i += incr) {
				if (num % i == 0) {
					if (div > 0) {
						div = 0;
						break;
					}
					div = i;
				}
			}
			if (div > 0)
				result += 1 + div + num / div + num;
		}
		return result;
	}
}
