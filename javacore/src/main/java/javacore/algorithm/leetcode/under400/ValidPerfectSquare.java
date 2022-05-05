package javacore.algorithm.leetcode.under400;

/*
 * LeetCode 367
*/
public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
        double result = Math.pow(num, 0.5);
        return result == (int) result;
    }
}
