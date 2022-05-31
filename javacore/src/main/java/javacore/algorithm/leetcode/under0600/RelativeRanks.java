package javacore.algorithm.leetcode.under0600;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 506
 */
public class RelativeRanks {
	public String[] findRelativeRanks(int[] nums) {
        int[] arr = new int[nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length); 
        Arrays.sort(arr);
        Map<Integer, String> map = new HashMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length -1) {
                map.put(arr[nums.length-1], "Gold Medal");
            } else if (i == nums.length -2) {
                map.put(arr[nums.length-2], "Silver Medal");
            } else if (i == nums.length -3) {
                map.put(arr[nums.length-3], "Bronze Medal");
            } else {
                map.put(arr[i], "" + (nums.length-i));
            }
        }
        String[] ans = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }
}
