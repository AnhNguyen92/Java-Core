package javacore.algorithm.leetcode.under0400;

import java.util.PriorityQueue;

/*
 * LeetCode 378. Kth Smallest Element in a Sorted Matrix
 */
public class KthSmallestElementInASortedMatrix {
	public int kthSmallest(int[][] matrix, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				queue.add(matrix[i][j]);
			}
		}
		while (k-- > 1) {
			queue.poll();
		}
		return queue.peek();
	}
}
