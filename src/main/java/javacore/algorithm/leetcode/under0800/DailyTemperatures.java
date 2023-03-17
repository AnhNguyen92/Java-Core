package javacore.algorithm.leetcode.under0800;

import java.util.Stack;

/*
 * LeetCode 739. Daily Temperatures
 */
public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		int m = temperatures.length;
        int[] ans = new int[m];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < m; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                ans[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return ans;
	}
}
