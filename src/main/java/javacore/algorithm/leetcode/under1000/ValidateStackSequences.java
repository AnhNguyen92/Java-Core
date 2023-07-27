package javacore.algorithm.leetcode.under1000;

import java.util.Stack;

/*
 * LeetCode 946. Validate Stack Sequences
 */
public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        while (i < pushed.length && j < popped.length) {
            if (pushed[i] != popped[j]) {
                stack.push(pushed[i++]);
            } else {
                i++;
                j++;
            }
            while (!stack.isEmpty() && j < popped.length && stack.peek() == popped[j]) {
                j++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
