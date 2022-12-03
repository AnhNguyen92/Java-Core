package javacore.algorithm.leetcode.under0400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 350. Intersection of Two Arrays II
*/
public class IntersectionOfTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> lst = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                lst.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] arr = new int[lst.size()];
        for (int k = 0; k < lst.size(); k++) {
            arr[k] = lst.get(k).intValue();
        }
        return arr;
    }
}
