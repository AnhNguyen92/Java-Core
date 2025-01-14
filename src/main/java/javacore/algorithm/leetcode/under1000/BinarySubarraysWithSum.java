package javacore.algorithm.leetcode.under1000;

import java.util.HashMap;
import java.util.Map;

/**
 * 930. Binary Subarrays With Sum
 */
public class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            sum += i;
            if (sum == goal)
                count++;
            if (map.get(sum - goal) != null)
                count += map.get(sum - goal);
            map.merge(sum, 1, Integer::sum);
        }
        return count;
    }
}
