package javacore.algorithm.leetcode.under2300;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 2295. Replace Elements in an Array
 */
public class ReplaceElementsInAnArray {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = operations.length - 1; i >= 0; i--) {
            if (map.containsKey(operations[i][1])) {
                map.put(operations[i][0], map.get(operations[i][1]));
                map.remove(operations[i][1]);
            } else {
                map.put(operations[i][0], operations[i][1]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                nums[i] = map.get(nums[i]);
            }
        }
        return nums;
    }
}
