package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1614. Maximum Nesting Depth of the Parentheses
 */
public class MaximumNestingDepthOfTheParentheses {
	public int maxDepth(String s) {
        int max = 0;
        int mng = 0;
        int dng = 0;
        for (char c  : s.toCharArray()) {
            if (c == '(') {
                mng++;
            } else if (c == ')') {
                dng++;
            }
            max = Math.max(max, mng - dng);
        }
        return max;
    }
}
