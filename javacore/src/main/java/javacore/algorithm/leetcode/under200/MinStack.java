package javacore.algorithm.leetcode.under200;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 155
 */
public class MinStack {
	/** initialize your data structure here. */
	private List<Integer> array = new ArrayList<>();

	public MinStack() {

	}

	public void push(int x) {
		array.add(x);
	}

	public void pop() {
		array.remove(array.size() - 1);
	}

	public int top() {
		return array.get(array.size() - 1).intValue();
	}

	public int getMin() {
		Integer min = array.get(0);
		for (Integer i : array) {
			if (Integer.compare(i, min) == -1) {
				min = i;
			}
		}
		return min.intValue();
	}
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */