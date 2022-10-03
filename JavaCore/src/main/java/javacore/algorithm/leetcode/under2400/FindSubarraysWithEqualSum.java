package javacore.algorithm.leetcode.under2400;

import java.util.HashSet;
import java.util.Set;

public class FindSubarraysWithEqualSum {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> lst = new HashSet<>();
        int sum;
        for (int i = 1; i < nums.length; i++) {
            sum = nums[i] + nums[i - 1];
            if (!lst.add(sum)) {
                return true;
            }
        }
        return false;
    }
}
