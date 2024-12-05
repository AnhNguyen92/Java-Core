package javacore.algorithm.leetcode.under3400;

import java.util.List;

/**
 * 3349. Adjacent Increasing Subarrays Detection I
 */
public class AdjacentIncreasingSubarraysDetectionI {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int count = 0;
        int curCount = 1;
        int prev = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i-1)) {
                curCount++;
                if (i == nums.size() - 1 && curCount >= 2 * k)
                    return true;
            } else {
                if (curCount >= 2 * k || (curCount >= k && prev >= k))
                    return true;
                prev = curCount;
                curCount = 1;
            }
        }
        return curCount >= k && prev >= k;
    }
}
