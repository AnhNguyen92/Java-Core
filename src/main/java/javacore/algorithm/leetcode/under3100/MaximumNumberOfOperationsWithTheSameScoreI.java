package javacore.algorithm.leetcode.under3100;

/**
 * 3038. Maximum Number of Operations With the Same Score I
 */
public class MaximumNumberOfOperationsWithTheSameScoreI {
    public int maxOperations(int[] nums) {
        int s = nums[0] + nums[1];
        int count = 1;
        for (int i = 2; i < nums.length-1; i += 2) {
            if (nums[i] + nums[i+1] != s)
                return count;
            count++;
        }
        return count;
    }
}
