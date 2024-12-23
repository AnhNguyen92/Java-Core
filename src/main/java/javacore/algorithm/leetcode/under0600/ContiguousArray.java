package javacore.algorithm.leetcode.under0600;

import java.util.HashMap;
import java.util.Map;

/**
 * 525. Contiguous Array
 */
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : nums[i];
            if (sum == 0) {
                max = i + 1;
            } else if (map.get(sum) != null) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return max;
    }
}
