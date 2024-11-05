package javacore.algorithm.leetcode.under3400;

import java.util.HashMap;
import java.util.Map;

/*
 * 3326. Minimum Division Operations to Make Array Non Decreasing
 */
public class MinimumDivisionOperationsToMakeArrayNonDecreasing {
    public int minOperations(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                int divisor;
                if (map.get(nums[i]) == null) {
                    divisor = greatestDivisor(nums[i]);
                    map.put(nums[i], divisor);
                } else {
                    divisor = map.get(nums[i]);
                }
                if (divisor == 1 || nums[i] / divisor > nums[i + 1]) {
                    return -1;
                }
                nums[i] /= divisor;
                count++;
            }
        }
        return count;
    }

    public int greatestDivisor(int n) {
        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
