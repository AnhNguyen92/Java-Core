package javacore.algorithm.leetcode.under1000;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode 989. Add to Array-Form of Integer
 */
public class AddToArrayFormOfInteger {
	public List<Integer> addToArrayForm(int[] nums, int k) {
		List<Integer> list = new ArrayList<>();
		int reminder = 0;
		int temp;
		for (int i = nums.length - 1; i >= 0; i--) {
			temp = k % 10 + nums[i] + reminder;
			list.add(0, temp % 10);
			reminder = temp / 10;
			k /= 10;
		}
		temp = k + reminder;
		while (temp > 0) {
			list.add(0, temp % 10);
			temp /= 10;
		}

		return list;
	}
}
