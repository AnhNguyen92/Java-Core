package javacore.algorithm.leetcode.under2300;

import java.util.Stack;

/*
 * LeetCode 2289. Steps to Make Array Non-decreasing
 */
public class StepsToMakeArrayNonDecreasing {
	public int totalSteps(int[] nums) {
		Stack<Integer> stack = new Stack<>();
        int[] dp = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                dp[i] = Math.max(dp[i] + 1, dp[stack.peek()]);
                stack.pop();
            }
            stack.push(i);
		}
        int ans = 0;
        for (int i : dp) {
            ans = Math.max(ans, i);
        }
		return ans;
    }
}
