package javacore.algorithm.leetcode.under0600;

import java.util.Arrays;

/*
 * LeetCode 581. Shortest Unsorted Continuous Subarray
 */
public class ShortestUnsortedContinuousSubarray {
	public int findUnsortedSubarray(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int first = 0;
        int last = nums.length - 1;
        for (int num : nums) {
            if (sorted[first] == num) {
                first++;
            } else {
                break;
            }
        }
        if (first >= last)
            return 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (sorted[last] == nums[i]) {
                last--;
            } else {
                break;
            }
        }
        return last - first + 1;
    }
}
