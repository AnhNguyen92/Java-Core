package javacore.algorithm.leetcode.under2100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 2089. Find Target Indices After Sorting Array
*/
public class FindTargetIndicesAfterSortingArray {
	public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                lst.add(i);
            }
            if (nums[i] > target) {
                break;
            }
        }
        
        return lst;
    }
}
