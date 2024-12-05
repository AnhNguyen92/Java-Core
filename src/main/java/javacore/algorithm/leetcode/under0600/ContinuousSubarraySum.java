package javacore.algorithm.leetcode.under0600;

import java.util.HashMap;
import java.util.Map;

/**
 * 523. Continuous Subarray Sum
 */
public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            sum %= k;
            Integer idx = map.get(sum);
            if ((sum == 0 && i > 0) || (idx != null && i - idx > 1))
                return true;
            if (idx == null)
                map.put(sum, i);
        }
        return false;
    }
}
