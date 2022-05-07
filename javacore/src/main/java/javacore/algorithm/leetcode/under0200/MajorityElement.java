package javacore.algorithm.leetcode.under0200;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 169
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int max = -1;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i , 0) + 1);
            if (map.get(i) > max) {
                max = map.get(i);
                res = i;
            }
        }
        return res;
    }
}
