package javacore.algorithm.leetcode.under2000;

import java.util.Stack;

/*
 * LeetCode 1944. Number of Visible People in a Queue
 */
public class NumberOfVisiblePeopleInAQueue {
	public int[] canSeePersonsCount(int[] heights) {
		int n = heights.length;
		int[] arr = new int[n];
		int count;
		int tallest = heights[n - 1];
		Stack<Integer> stack = new Stack<>();
		for (int i = n - 1; i >= 0; i--) {
			count = 0;
			while (!stack.isEmpty()) {
				tallest = stack.peek();
				count++;
				if (heights[i] <= tallest) {
					break;
				} else {
					stack.pop();
				}
			}
			stack.push(heights[i]);
			arr[i] = count;
		}
		return arr;
    }
}
