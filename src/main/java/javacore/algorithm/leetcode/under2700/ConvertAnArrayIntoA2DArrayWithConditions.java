package javacore.algorithm.leetcode.under2700;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2610. Convert an Array Into a 2D Array With Conditions
 */
public class ConvertAnArrayIntoA2DArrayWithConditions {
	public List<List<Integer>> findMatrix(int[] nums) {
		int[] arr = new int[201];
		int max = 0;
		for (int i : nums) {
			arr[i]++;
			max = Math.max(max, i);
		}
		List<List<Integer>> res = new ArrayList<>();
		boolean cont = false;
		do {
			cont = false;
			List<Integer> item = new ArrayList<>();
			for (int i = 1; i < 201; i++) {
				if (arr[i] > 0) {
					item.add(i);
					arr[i]--;
					cont = true;
				}
			}
			if (!item.isEmpty())
				res.add(item);
		} while (cont);
		return res;
	}
}
