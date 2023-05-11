package javacore.algorithm.leetcode.under1400;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * LeetCode 1354. Construct Target Array With Multiple Sums
 */
public class ConstructTargetArrayWithMultipleSums {
	public boolean isPossible(int[] target) {
		PriorityQueue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
		long sum = 0;
		for (int i : target) {
			sum += i;
			queue.add((long) i);
		}
		long max;
		long temp;
		while ((max = queue.peek()) > 1) {
			queue.poll();
			temp = sum - max;
			if (temp >= max || temp < 1) {
				return false;
			}
			if (max % temp == 0) {
				queue.add(temp);
				sum -= max - temp;
			} else {
				queue.add(max % temp);
				sum -= max - max % temp;
			}
		}
		return queue.size() == sum;
	}
}
