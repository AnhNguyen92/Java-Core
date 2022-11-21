package javacore.algorithm.leetcode.under2500;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 2475. Number of Unequal Triplets in Array

 */
public class NumberOfUnequalTripletsInArray {
    public int unequalTriplets(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n - 2; i ++) {
            for (int j = i + 1; j < n - 1; j ++) {
                if (nums[i] != nums[j]) {
                    for (int k = j + 1; k < n; k ++) {
                        if (nums[i] != nums[k] && nums[j] != nums[k]) {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }

}
