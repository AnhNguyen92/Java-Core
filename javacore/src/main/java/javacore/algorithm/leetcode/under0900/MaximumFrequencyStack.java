package javacore.algorithm.leetcode.under0900;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * LeetCode 895
 */
public class MaximumFrequencyStack {

	class FreqStack {
		int max;
		Map<Integer, Stack<Integer>> group;
		Map<Integer, Integer> freqMap;

		public FreqStack() {
			max = 0;
			group = new HashMap<>();
			freqMap = new HashMap<>();
		}

		public void push(int val) {
			int f = freqMap.getOrDefault(val, 0);
			freqMap.put(val, f + 1);
			if (f > max) {
				max = f;
			}
			group.computeIfAbsent(f, z -> new Stack<Integer>()).push(val);
		}

		public int pop() {
			int x = group.get(max).pop();
			freqMap.put(x, freqMap.get(x) - 1);
			if (group.get(max).isEmpty()) {
				group.remove(max--);
			}
			return x;
		}
	}

	/**
	 * Your FreqStack object will be instantiated and called as such: FreqStack obj
	 * = new FreqStack(); obj.push(val); int param_2 = obj.pop();
	 */
}
