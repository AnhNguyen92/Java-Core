package javacore.algorithm.leetcode.under0300;

import java.util.TreeSet;

/*
 *LeetCode 220. Contains Duplicate III
 */
public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        Long num;
        Long floor;
        Long ceil;
        for (int i = 0; i < nums.length; i++) {
            num = Long.valueOf(nums[i]);
            floor = set.floor(num);
            ceil = set.ceiling(num);
            if (floor != null && Math.abs(floor - num) <= t) {
                return true;
            }
            if (ceil != null && Math.abs(ceil - num) <= t) {
                return true;
            }
            set.add(num);
            if (set.size() > k) {
                set.remove(1L * nums[i - k]);
            }
        }

        return false;
    }
}
