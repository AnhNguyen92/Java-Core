package javacore.algorithm.leetcode.under2100;

/**
 * 2023. Number of Pairs of Strings With Concatenation Equal to Target
 */
public class NumberOfPairsOfStringsWithConcatenationEqualToTarget {
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j != i && j < nums.length; j++) {
                if ( (nums[i] + nums[j]).equals(target)) {
                    count++;
                }
                if ( (nums[j] + nums[i]).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }
}
