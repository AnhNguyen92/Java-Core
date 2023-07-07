package javacore.algorithm.leetcode.under2000;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;


/*
 * LeetCode 1910. Remove All Occurrences of a Substring
 */
public class RemoveAllOccurrencesOfASubstring {
	public String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();
        char[] crr = s.toCharArray();
        for (char c : crr) {
        	queue.add(c);
        }
        char l = part.charAt(part.length() - 1);
        while (!queue.isEmpty()) {
        	char c = queue.poll();
        	stack.push(c);
        	if (c == l) {
        		Stack<Character> temp = new Stack<>();
        		int i = part.length() - 1;
        		while (i >= 0 && !stack.isEmpty() && stack.peek() == part.charAt(i)) {
        			temp.push(stack.pop());
        			i--;
        		}
        		if (i >= 0) {
        			while (!temp.isEmpty()) {
        				stack.push(temp.pop());
        			}
        		}
        	}
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
        	sb.append(stack.pop());
        }
        return sb.reverse().toString();
        
    }
}
