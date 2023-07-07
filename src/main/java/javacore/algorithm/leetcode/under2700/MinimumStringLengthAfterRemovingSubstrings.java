package javacore.algorithm.leetcode.under2700;

import java.util.Stack;

/*
 * LeetCode 2696. Minimum String Length After Removing Substrings
 */
public class MinimumStringLengthAfterRemovingSubstrings {
	public int minLength(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (!stack.isEmpty() && ((stack.peek() == 'A' && c == 'B') || (stack.peek() == 'C' && c == 'D'))) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		return stack.size();
	}
}
