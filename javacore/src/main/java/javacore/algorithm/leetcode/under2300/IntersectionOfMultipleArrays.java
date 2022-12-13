package javacore.algorithm.leetcode.under2300;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2248. Intersection of Multiple Arrays
 */
public class IntersectionOfMultipleArrays {
	public List<Integer> intersection(int[][] nums) {
		int[] arr = new int[1001];
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				arr[nums[i][j]]++;
			}
		}
		List<Integer> lst = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			if (arr[i] == len) {
				lst.add(i);
			}
		}
		return lst;
	}
}
