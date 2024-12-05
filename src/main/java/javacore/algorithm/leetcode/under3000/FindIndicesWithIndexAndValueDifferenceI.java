package javacore.algorithm.leetcode.under3000;

/**
 * 2903. Find Indices With Index and Value Difference I
 */
public class FindIndicesWithIndexAndValueDifferenceI {
    public int[] findIndices(int[] nums, int idxDiff, int valDiff) {
        for (int i = 0; i < nums.length - idxDiff; i++) {
            for (int j = i + idxDiff; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) >= valDiff ) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
