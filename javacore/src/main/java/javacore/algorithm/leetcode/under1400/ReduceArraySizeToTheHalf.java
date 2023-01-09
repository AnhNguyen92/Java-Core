package javacore.algorithm.leetcode.under1400;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * LeetCode 1338. Reduce Array Size to The Half
 */
public class ReduceArraySizeToTheHalf {
	public int minSetSize(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		map.values().forEach(queue::add);
		int count = 0;
		int total = 0;
		while (total < arr.length / 2) {
			total += queue.poll();
			count++;
		}
		return count;
	}
}
