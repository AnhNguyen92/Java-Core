package javacore.algorithm.leetcode.under2000;

import java.util.Arrays;

/*
 * LeetCode 1979
 */
public class FindGreatestCommonDivisorOfArray {
	public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length - 1]);
    }
    
    private int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}
