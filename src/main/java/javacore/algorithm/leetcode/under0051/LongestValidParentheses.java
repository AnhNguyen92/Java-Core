package javacore.algorithm.leetcode.under0051;

import java.util.Stack;

/**
 * 32. Longest Valid Parentheses
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<String> stack = new Stack<>();
        String open = "(";
        String close = ")";
        int max = 0;
        int val;
        boolean process;
        for (char c : s.toCharArray()) {
            if (c == '(' || stack.isEmpty() || stack.peek().equals(close)) {
                stack.push(String.valueOf(c));
            } else {
                String pop = stack.pop();
                if (pop.equals(open)) {
                    val = 2;
                    if (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                        val += Integer.parseInt(stack.pop());
                    }
                    max = Math.max(max, val);
                    stack.push(String.valueOf(val));
                } else {
                    val = Integer.parseInt(pop);
                    process = false;
                    if (!stack.isEmpty() && stack.peek().equals(open)) {
                        val += 2;
                        process = true;
                        stack.pop();
                        if (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                            val += Integer.parseInt(stack.pop());
                        }
                    }
                    stack.push(String.valueOf(val));
                    max = Math.max(max, val);
                    if (!process) {
                        stack.push(close);
                    }
                }
            }
        }
        return max;
    }
}
