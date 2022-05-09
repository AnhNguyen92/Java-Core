package javacore.algorithm.leetcode.under2100;

import java.util.PriorityQueue;

/*
 * LeetCode 2099
 */
public class FindSubsequenceOfLengthKWithTheLargestSum {
	public int[] maxSubsequence(int[] nums, int k) {
		int[] ans = new int[k];
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			ans[i] = nums[i];
			priorityQueue.add(nums[i]);
		}
		int j;
		for (int i = k; i < nums.length; i++) {
			Integer min = priorityQueue.peek();
			if (min.intValue() < nums[i]) {
				priorityQueue.poll();
				priorityQueue.add(nums[i]);
				j = 0;
				while (j < k && ans[j] != min.intValue()) {
					j++;
				}
				while (j < k - 1) {
					ans[j] = ans[j + 1];
					j++;
				}
				ans[k - 1] = nums[i];
			}
		}
		return ans;
    }
}
