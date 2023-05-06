package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2600. K Items With the Maximum Sum
 */
public class KItemsWithTheMaximumSum {
	public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        int count = Math.min(numOnes , k);
        sum += count;
        k -= count;
        count = Math.min(numZeros , k);
        k -= count;
        count = Math.min(numNegOnes , k);
        sum -= count;
        k -= count;
        return sum;
    }
}
