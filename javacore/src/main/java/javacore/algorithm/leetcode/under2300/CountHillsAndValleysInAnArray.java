package javacore.algorithm.leetcode.under2300;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 17
 */
public class CountHillsAndValleysInAnArray {
	public int countHillValley(int[] nums) {
		int hill = 0;
		int valley = 0;
		List<Integer> lst = new ArrayList<>();
		lst.add(nums[0]);
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (lst.get(index) != nums[i]) {
				lst.add(nums[i]);
				index++;
			}
		}
		for (int i = 1; i < lst.size() - 1; i++) {
			if (lst.get(i) > lst.get(i - 1) && lst.get(i) > lst.get(i + 1)) {
				hill++;
			} else if (lst.get(i) < lst.get(i - 1) && lst.get(i) < lst.get(i + 1)) {
				valley++;
			}
		}
		return valley + hill;
	}
}
