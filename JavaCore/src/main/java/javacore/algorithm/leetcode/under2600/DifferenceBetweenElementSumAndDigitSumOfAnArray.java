package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2535. Difference Between Element Sum and Digit Sum of an Array
 */
public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
	public int differenceOfSum(int[] nums) {
		int elmSum = 0;
		for (int i : nums) {
			if (i > 9) {
				elmSum += i;
				while (i > 0) {
					elmSum -= i % 10;
					i /= 10;
				}
			}
		}
		return elmSum;
	}

}
