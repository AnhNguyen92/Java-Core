package javacore.algorithm.leetcode.under0400;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 349. Intersection of Two Arrays
*/
public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> resultSet = new HashSet<>();
        Set<Integer> setNum1 = new HashSet<>();
        for (int i : nums1) {
            setNum1.add(i);
        }
        for (int i : nums2) {
            if (setNum1.contains(i)) {
                resultSet.add(i);
            }
        }
        int j = 0;
        int[] arr = new int[resultSet.size()];
        for (Integer item : resultSet) {
            arr[j++] = item.intValue();
        }
        return arr;
    }
}
