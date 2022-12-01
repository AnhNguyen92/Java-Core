package javacore.algorithm.leetcode.under0300;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * LeetCode 215. Kth Largest Element in an Array
 */
public class KthLargestElementInAnArray {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

	public int findKthLargestUsingQueue(int[] nums, int k) {
		Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : nums) {
			queue.add(i);
		}
		while (k-- > 1) {
			queue.poll();

		}
		return queue.peek();
	}

	public int findKthLargestUsingStream(int[] nums, int k) {
		return Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip((long) k - 1).findFirst().orElse(0);
	}
}
