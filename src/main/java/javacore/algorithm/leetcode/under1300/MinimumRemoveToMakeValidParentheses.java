package javacore.algorithm.leetcode.under1300;

import java.util.Stack;

/**
 * 1249. Minimum Remove to Make Valid Parentheses
 */
public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.add(i);
            } else if (c == ')') {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(')
                    stack.pop();
                else {
                    stack.add(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder(s);
        while (!stack.isEmpty()) {
            sb.deleteCharAt(stack.pop());
        }
        return sb.toString();
    }
}
