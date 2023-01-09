package javacore.algorithm.leetcode.under0500;

import java.util.Stack;

/*
 * LeetCode 456. 132 Pattern
 */
public class OneTwoThreePattern {
	public boolean find132pattern(int[] nums) {
        if (nums.length < 3)
            return false;
        int[] mins = new int[nums.length];
        mins[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            mins[i] = (nums[i] < mins[i-1]) ? nums[i] : mins[i-1];
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > mins[i]) {
                while (!stack.isEmpty() && stack.peek() <= mins[i]) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() < nums[i]) {
                    return true;
                }
            }
            stack.push(nums[i]);
            
        }
        return false;
    }
}
