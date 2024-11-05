package javacore.algorithm.leetcode.under3200;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 3174. Clear Digits
 */
public class ClearDigits {
    public String clearDigits(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!deque.isEmpty() && Math.abs(c - deque.peek()) >= 40) {
                deque.pop();
            } else {
                deque.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.removeLast());
        }
        return sb.toString();
    }
}
