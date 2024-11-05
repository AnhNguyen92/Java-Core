package javacore.algorithm.leetcode.under3200;

/**
 * 3190. Find Minimum Operations to Make All Elements Divisible by Three
 */
public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 3 != 0) {
                count++;
            }
        }
        return count;
    }
}
