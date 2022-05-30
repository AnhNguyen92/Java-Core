package javacore.algorithm.leetcode.under0400;

/*
 * LeetCode 371
 */
public class SumOfTwoIntegers {
	public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
