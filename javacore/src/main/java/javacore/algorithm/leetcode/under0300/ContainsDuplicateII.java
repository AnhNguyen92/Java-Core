package javacore.algorithm.leetcode.under0300;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 219. Contains Duplicate II
 */
public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        int last = nums.length - 1;
        for (int i = 0; i < last; i ++) {
            for (int j = i + 1; j <= Math.min(i + k, last); j++) 
                if ( nums[i] == nums[j]) {
                    return true;
                }
        }
        return false;
    }
	
	public boolean containsNearbyDuplicate1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prev;
        for (int i = 0; i < nums.length; i++) {
            prev = map.getOrDefault(nums[i], -1000000);
            if (i - prev <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
