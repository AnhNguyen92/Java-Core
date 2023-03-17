package javacore.algorithm.leetcode.under1500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 1403. Minimum Subsequence in Non-Increasing Order
 */
public class MinimumSubsequenceInNonIncreasingOrder {
	public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int i = nums.length - 1;
        int ans = 0;
        List<Integer> lst = new ArrayList<>();
        while (ans <= sum/2) {
            ans += nums[i];
            lst.add(nums[i]);
            i--;
        }
        return lst;
    }
}
