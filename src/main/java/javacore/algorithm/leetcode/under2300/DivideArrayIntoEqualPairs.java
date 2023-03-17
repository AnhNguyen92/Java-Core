package javacore.algorithm.leetcode.under2300;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 2206. Divide Array Into Equal Pairs
 */
public class DivideArrayIntoEqualPairs {
	public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        boolean paired = true;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() % 2 == 1) {
                paired = false;
            }
        }
        return paired;
    }
}
