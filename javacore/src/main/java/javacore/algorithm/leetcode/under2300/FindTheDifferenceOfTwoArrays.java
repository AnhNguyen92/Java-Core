package javacore.algorithm.leetcode.under2300;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2215. Find the Difference of Two Arrays
 */
public class FindTheDifferenceOfTwoArrays {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        boolean found;
        for (int i = 0; i < nums1.length; i++) {
            found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found && !first.contains(nums1[i])) {
                first.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            found = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[j] == nums2[i]) {
                    found = true;
                    break;
                }
            }
            if (!found && !second.contains(nums2[i])) {
                second.add(nums2[i]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        
        ans.add(first);
        ans.add(second);
        return ans;
    }
}
