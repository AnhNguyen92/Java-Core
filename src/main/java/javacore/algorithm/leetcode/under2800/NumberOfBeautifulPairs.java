package javacore.algorithm.leetcode.under2800;

/*
 * LeetCode 2748. Number of Beautiful Pairs
 */
public class NumberOfBeautifulPairs {
	public int countBeautifulPairs(int[] nums) {
		int count = 0;
		int x;
		for (int i = 0; i < nums.length; i++) {
			x = nums[i];
			while (x >= 10) {
				x /= 10;
			}
			for (int j = i + 1; j < nums.length; j++) {
				if (gcd(x, nums[j] % 10) == 1) {
					count++;
				}
			}
		}
		return count;
	}

	private int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
