package javacore.algorithm.leetcode.under0900;

import java.util.Stack;

/**
 * 856. Score of Parentheses
 */
public class ScoreOfParentheses {
    public int scoreOfParentheses(String s) {
        int a = 0;
        int res = 0;
        Stack<String> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.add("(");
            } else {
                String cur = stack.pop();
                if (cur.equals("(")) {
                    if (stack.isEmpty() || stack.peek().equals("(")) {
                        stack.push("1");
                    } else {
                        stack.push(String.valueOf(1 + Integer.parseInt(stack.pop())));
                    }
                } else {
                    int peek = Integer.parseInt(cur) * 2;
                    stack.pop();
                    if (stack.isEmpty() || stack.peek().equals("(")) {
                        stack.push(String.valueOf(peek));
                    } else {
                        peek += Integer.parseInt(stack.pop());
                        stack.push(String.valueOf(peek));
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return Integer.parseInt(sb.toString());
    }
}
