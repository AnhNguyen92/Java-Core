package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 503. Next Greater Element II
 */
public class NextGreaterElementII {
	public int[] nextGreaterElements(int[] nums) {
		int[] arr = new int[nums.length * 2 - 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = nums[i % nums.length];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = findNext(arr, nums, i);
		}
		return nums;
	}

	private int findNext(int[] arr, int[] nums, int i) {
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] > nums[i])
				return arr[j];
		}
		return -1;
	}
}
