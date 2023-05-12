package javacore.algorithm.leetcode.under2700;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2614. Prime In Diagonal
 */
public class PrimeInDiagonal {
	List<Integer> primes = new ArrayList<>();

	public int diagonalPrime(int[][] nums) {
		int ans = 0;
		int j = nums.length - 1;
		for (int i = 0; i <= j; i++) {
			if (isPrime(nums[i][i])) {
				ans = Math.max(ans, nums[i][i]);
			}
			if (isPrime(nums[i][j - i])) {
				ans = Math.max(ans, nums[i][j - i]);
			}
		}
		return ans;
	}

	public boolean isPrime(int n) {
		if (n <= 1)
			return false;
		else if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
