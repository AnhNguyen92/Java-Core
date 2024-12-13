package javacore.algorithm.leetcode.under3400;

import java.util.HashSet;
import java.util.Set;

/**
 * 3375. Minimum Operations to Make Array Values Equal to K
 */
public class MinimumOperationsToMakeArrayValuesEqualToK {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (i < k)
                return -1;
            else if (i > k) {
                set.add(i);
            }
        }
        return set.size();
    }
}
