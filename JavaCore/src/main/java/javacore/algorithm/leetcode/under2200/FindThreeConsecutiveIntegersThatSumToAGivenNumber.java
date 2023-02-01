package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2177. Find Three Consecutive Integers That Sum to a Given Number
 */
public class FindThreeConsecutiveIntegersThatSumToAGivenNumber {
	public long[] sumOfThree(long num) {
        long x = num / 3;
        if ( x * 3 == num) {
            return new long[] {x - 1, x, x + 1};
        }
        return new long[] {};
    }
}
