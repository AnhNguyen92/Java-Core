package javacore.algorithm.leetcode.under0600;

import java.util.*;

/**
 * 532. K-diff Pairs in an Array
 */
public class KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        int prev = nums[0] - 1;
        for (int i : set) {
            if (k != 0) {
                count += (map.get(i-k) != null) ? 1 : 0;
            } else if (i != prev) {
                count += (map.get(i) > 1) ? 1 : 0;
                prev = i;
            }
        }
        return count;
    }
}
