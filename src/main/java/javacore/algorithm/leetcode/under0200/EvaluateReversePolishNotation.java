package javacore.algorithm.leetcode.under0200;

import java.util.Stack;

/*
 * LeetCode 150. Evaluate Reverse Polish Notation
*/
public class EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for (String s : tokens) {
			if (s.equals("+")) {
				stack.push(stack.pop() + stack.pop());
			} else if (s.equals("-")) {
				stack.push(-stack.pop() + stack.pop());
			} else if (s.equals("*")) {
				stack.push(stack.pop() * stack.pop());
			} else if (s.equals("/")) {
				stack.push(1 / stack.pop() * stack.pop());
			} else {
				stack.push(Integer.valueOf(s));
			}
		}
		return stack.pop();
	}
}
