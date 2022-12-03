package javacore.algorithm.leetcode.under0400;

/*
 * LeetCode 367. Valid Perfect Square
*/
public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
        double result = Math.pow(num, 0.5);
        return result == (int) result;
    }
}
