package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2507. Smallest Value After Replacing With Sum of Prime Factors
 */
public class SmallestValueAfterReplacingWithSumOfPrimeFactors {
	public int smallestValue(int n) {
		if (isPrime(n)) {
			return n;
		}
		int sum = n;
		int presum;
		int i;
		do {
			presum = sum;
			sum = 0;
			i = 2;
			while (n > 1) {
				while (n % i == 0) {
					sum += i;
					n /= i;
				}
				i++;
			}
			n = sum;
		} while (sum < presum);
		return sum;
	}

	private boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
