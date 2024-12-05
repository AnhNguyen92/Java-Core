package javacore.algorithm.leetcode.under3400;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 3371. Identify the Largest Outlier in an Array
 */
public class IdentifyTheLargestOutlierInAnArray {
    public int getLargestOutlier(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int n : nums) {
            sum += n;
            map.merge(n, 1, Integer::sum);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if ( (sum - nums[i]) % 2 == 0) {
                int special = (sum - nums[i]) / 2;
                int frequent = map.getOrDefault(special, 0);
                if (frequent > 1 || (nums[i] != special && frequent > 0) ) {
                    return nums[i];
                }
            }
        }
        return nums[0];
    }
}
