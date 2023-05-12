package javacore.algorithm.leetcode.under2600;

import java.util.Stack;

/*
 * LeetCode 2566. Maximum Difference by Remapping a Digit
 */
public class MaximumDifferenceByRemappingADigit {
	public int minMaxDifference(int num) {
        Stack<Integer> stack = new Stack<>();
        int m = 0;
        int n = 0;
        int t;
        while (num > 0) {
            t = num % 10;
            stack.push(t);
            if (t < 9) {
                m = t;
            }
            if (num < 10) {
                n = t;
            }
            num /= 10;
        }
        int ans = 0;
        int min = 0;
        int max = 0;
        while (!stack.isEmpty()) {
            t = stack.pop();
            ans *= 10;
            max = (t == m) ? 9 : t;
            min = (t == n) ? 0 : t;
            ans += max - min;
        }
        return ans;
    }
}
