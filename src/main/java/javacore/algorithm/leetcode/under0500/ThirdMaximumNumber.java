package javacore.algorithm.leetcode.under0500;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * LeetCode 414. Third Maximum Number
 */
public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		if (list.size() >= 3) {
			return list.get(list.size() - 3);
		} else {
			return list.get(list.size() - 1);
		}
	}
}
