package javacore.algorithm.leetcode.under3000;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2913. Subarrays Distinct Element Sum of Squares I
 */
public class SubarraysDistinctElementSumOfSquaresI {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        Set<Integer> set;
        for (int i = 0; i < nums.size(); i++) {
            set = new HashSet<>();
            for (int j = i; j < nums.size(); j++) {
                set.add(nums.get(j));
                ans += set.size() * set.size();
            }
        }

        return ans;
    }
}
