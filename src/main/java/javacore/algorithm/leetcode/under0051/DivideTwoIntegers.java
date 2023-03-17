package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 29. Divide Two Integers
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        long absA = Math.abs((long) dividend);
        long absB = Math.abs((long) divisor);

        long result = absA / absB;

        result = (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0) ? result : -result;

        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }
        return (int) result;
    }

}
