package javacore.algorithm.leetcode.under2000;

import java.util.Stack;

/**
 * 1963. Minimum Number of Swaps to Make the String Balanced
 */
public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return (stack.size() / 2 + 1) / 2;
    }
}
