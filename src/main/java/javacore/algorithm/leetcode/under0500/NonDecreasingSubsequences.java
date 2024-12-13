package javacore.algorithm.leetcode.under0500;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 491. Non-decreasing Subsequences
 */
public class NonDecreasingSubsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        travel(ans, new ArrayList<>(), nums, 0);

        return new ArrayList<>(ans);
    }

    private void travel(Set<List<Integer>> ans, List<Integer> item, int[] nums, int idx) {
        if (item.size() > 1)
            ans.add(new ArrayList<>(item));
        for (int i = idx; i < nums.length; i++) {
            if (item.isEmpty() || nums[i] >= item.get(item.size() - 1)) {
                item.add(nums[i]);
                travel(ans, item, nums, i+1);
                item.remove(item.size() - 1);
            }
        }
    }
}
