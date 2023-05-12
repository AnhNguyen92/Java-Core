package javacore.algorithm.leetcode.under2600;

import java.util.Stack;

/*
 * LeetCode 2553. Separate the Digits in an Array
 */
public class SeparateTheDigitsInAnArray {
	public int[] separateDigits(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		for (int i = nums.length - 1; i >= 0; i--) {
			while (nums[i] > 0) {
				stack.push(nums[i] % 10);
				nums[i] /= 10;
			}
		}
		int[] arr = new int[stack.size()];
		int i = 0;
		while (!stack.isEmpty()) {
			arr[i++] = stack.pop();
		}
		return arr;
	}
}
