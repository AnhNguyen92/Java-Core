package javacore.algorithm.leetcode.under0800;

import java.util.Arrays;

/*
 * LeetCode 704. Binary Search
 */
public class BinarySearch {
	public int search(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
    return (index < 0) ? -1 : index;
    }
}
