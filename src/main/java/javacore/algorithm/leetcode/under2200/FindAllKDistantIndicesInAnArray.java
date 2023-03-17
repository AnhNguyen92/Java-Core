package javacore.algorithm.leetcode.under2200;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * LeetCode 2200. Find All K-Distant Indices in an Array
*/
public class FindAllKDistantIndicesInAnArray {
	public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
		Set<Integer> keys = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key) {
				int j = (i - k >= 0) ? (i - k) : 0;
				for (; j <= (i + k) && j < nums.length; j++) {
					keys.add(j);
				}
			}
		}
		return keys.stream().sorted().collect(Collectors.toList());
	}

}
