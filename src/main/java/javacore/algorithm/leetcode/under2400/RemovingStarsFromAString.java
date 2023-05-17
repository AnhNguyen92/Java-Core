package javacore.algorithm.leetcode.under2400;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * LeetCode 2390. Removing Stars From a String
 */
public class RemovingStarsFromAString {
	public String removeStars(String s) {
		Deque<Character> dequeue = new ArrayDeque<>();
		for (char c : s.toCharArray()) {
			if (c == '*') {
				if (!dequeue.isEmpty()) {
					dequeue.pop();
				}
			} else {
				dequeue.push(c);
			}
		}
		StringBuilder sb = new StringBuilder();
		while (!dequeue.isEmpty()) {
			sb.append(dequeue.pollLast());
		}
		return sb.toString();
	}
}
