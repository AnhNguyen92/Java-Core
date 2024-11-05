package javacore.algorithm.leetcode.under3000;

import java.util.HashMap;
import java.util.Map;

/**
 * 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum
 */
public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {
    public int missingInteger(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        int sum = 0;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
            if (!found && (i == 0 || nums[i] == nums[i - 1] + 1)) {
                sum += nums[i];
            } else {
                found = true;
            }
        }
        while (map.get(sum) != null) {
            sum++;
        }
        return sum;

    }
}
