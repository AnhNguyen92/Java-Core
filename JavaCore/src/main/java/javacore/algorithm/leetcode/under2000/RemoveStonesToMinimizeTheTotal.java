package javacore.algorithm.leetcode.under2000;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * LeetCode 1962. Remove Stones to Minimize the Total
 */
public class RemoveStonesToMinimizeTheTotal {
	public int minStoneSum(int[] piles, int k) {
		int n = piles.length;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(n, Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			queue.add(piles[i]);
		}
		for (int i = 1; i <= k; i++) {
			int val = queue.poll();
			queue.add(val - val / 2);
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += queue.poll();
		}
		return sum;
	}
}
