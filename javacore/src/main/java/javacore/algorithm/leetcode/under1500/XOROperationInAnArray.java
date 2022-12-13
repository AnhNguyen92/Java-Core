package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1486. XOR Operation in an Array
 */
public class XOROperationInAnArray {
	public int xorOperation(int n, int start) {
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = start + 2 * i;
		}
		int sum = nums[0];
		for (int i = 1; i < n; i++) {
			sum = sum ^ nums[i];
		}
		return sum;
	}
}
