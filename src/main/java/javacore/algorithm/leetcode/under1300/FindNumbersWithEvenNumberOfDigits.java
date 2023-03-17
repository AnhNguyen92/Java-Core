package javacore.algorithm.leetcode.under1300;

/*
 * LeetCode 1295. Find Numbers with Even Number of Digits
 */
public class FindNumbersWithEvenNumberOfDigits {
	public int findNumbers(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (evenDigit(nums[i]))
				count++;
		}
		return count;
	}

	public boolean evenDigit(int n) {
		while (n >= 100) {
			n /= 100;
		}
		return (n > 9);
	}
}
