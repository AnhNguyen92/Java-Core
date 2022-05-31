package javacore.algorithm.leetcode.under1000;

import java.util.Deque;
import java.util.LinkedList;

/*
 * Leetcode 933
 */
public class NumberOfRecentCalls {
	private Deque<Integer> buffer = new LinkedList<>();

	public NumberOfRecentCalls() {
	}

	public int ping(int t) {
		buffer.addLast(t);
		while (buffer.getFirst() < t - 3000)
			buffer.pollFirst();
		return buffer.size();
	}
}
