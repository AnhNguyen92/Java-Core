package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 908. Smallest Range I
 */
public class SmallestRangeI {
	public int smallestRangeI(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        int distance = max - min;
        return ( (max - min <=  2 * k) ? 0 : (distance - 2 * k) );
    }
}
