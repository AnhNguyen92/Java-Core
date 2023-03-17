package javacore.algorithm.leetcode.under2200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 2150. Find All Lonely Numbers in the Array
 */
public class FindAllLonelyNumbersInTheArray {
	public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lst = new ArrayList<>();
        int n = nums.length;
        if (n == 1) {
            lst.add(nums[0]);
        } else {
            for (int i = 1; i < n - 1; i++) {
                if (nums[i] - nums[i-1] > 1 && nums[i+1] - nums[i] > 1) {
                    lst.add(nums[i]);
                }
            }
            if (nums[1] - nums[0] > 1) {
                lst.add(nums[0]);
            }
            if (nums[n-1] - nums[n-2] > 1) {
                lst.add(nums[n-1]);
            }
        }
        
        return lst;
    }
}
