package javacore.algorithm.leetcode.under2800;

import java.util.ArrayList;
import java.util.List;

/*
 * 2750. Ways to Split Array Into Good Subarrays
 */
public class WaysToSplitArrayIntoGoodSubarrays {
    public int numberOfGoodSubarraySplits(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                lst.add(i);
            }
        }
        if (lst.isEmpty()) {
            return 0;
        }
        long ans = 1L;
        for (int i = 1; i < lst.size(); i++) {
            ans = ans * (lst.get(i) - lst.get(i-1)) % 1000000007L;
        }
        return (int) ans;


    }
}
