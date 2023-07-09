package javacore.algorithm.leetcode.under0100;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 89. Gray Code
 */
public class GrayCode {
	public List<Integer> grayCode(int n) {
		List<Integer> lst = new ArrayList<>();
		for (int i = 0; i < 1 << n; i++) {
			lst.add(binaryToGray(i));
		}
		return lst;
	}

	private int binaryToGray(int num) {
		return num ^ (num >> 1);
	}
}
