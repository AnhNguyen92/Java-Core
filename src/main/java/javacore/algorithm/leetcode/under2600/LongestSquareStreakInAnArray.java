package javacore.algorithm.leetcode.under2600;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 2501. Longest Square Streak in an Array
 */
public class LongestSquareStreakInAnArray {
	public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int ans = -1;
        int count = 0;
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            count = 1;
            temp = nums[i];
            while (temp <= 46340 && set.contains(temp * temp)) {
                temp = temp * temp;
                count++;
            }
            if (count > 1 && count > ans) {
                ans = count;
            }
        }
        return ans;
    }
}
