package javacore.algorithm.leetcode.under1900;

import java.util.Arrays;

/**
 * 1887. Reduction Operations to Make the Array Elements Equal
 */
public class ReductionOperationsToMakeTheArrayElementsEqual {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int time = 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                time++;
            }
            count += time;
        }
        return count;
    }
}
