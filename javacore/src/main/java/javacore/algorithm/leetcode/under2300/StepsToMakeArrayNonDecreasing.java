package javacore.algorithm.leetcode.under2300;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2289. Steps to Make Array Non-decreasing
 */
public class StepsToMakeArrayNonDecreasing {
	public static void main(String[] args) {
		StepsToMakeArrayNonDecreasing app = new StepsToMakeArrayNonDecreasing();
		System.out.println(app.totalSteps(new int[] { 4, 5, 7, 7, 13 }));

	}

	public int totalSteps(int[] nums) {
		int count = 0;
		List<Integer> lst = new ArrayList<>();
		for (int i : nums) {
			lst.add(i);
		}
		int end;
		boolean found;
		do {
			found = false;
			end = lst.size() - 1;
			for (int i = end; i >= 1; i--) {
				if (lst.get(i) < lst.get(i - 1)) {
					if (!found) {
						count++;
					}
					found = true;
					lst.remove(i);
				}
			}
		} while (found);
		return count;
	}
}
