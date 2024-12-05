package javacore.algorithm.leetcode.under2500;

import java.util.HashMap;
import java.util.Map;

/**
 * 2461. Maximum Sum of Distinct Subarrays With Length K
 */
public class MaximumSumOfDistinctSubarraysWithLengthK {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < k; i++) {
            map.merge(nums[i], 1, Integer::sum);
            sum += nums[i];
        }
        long max = (map.size() == k) ? sum : 0;
        for (int i = k; i < nums.length; i++) {
            if (map.get(nums[i-k]) == 1) {
                map.remove(nums[i-k]);
            } else {
                map.merge(nums[i-k], -1, Integer::sum);
            }
            map.merge(nums[i], 1, Integer::sum);
            sum -= nums[i-k];
            sum += nums[i];
            if (map.size() == k) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
