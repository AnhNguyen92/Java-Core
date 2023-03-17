package javacore.algorithm.leetcode.under0500;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 459. Repeated Substring Pattern
 */
public class RepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String s) {
		if (s.length() == 1)
			return false;
		int[] arr = getArr(s.length());
		int count = 0;
		for (int i : arr) {
			String ss = s.substring(0, i);
			count = 1;
			for (int j = i; j < s.length(); j += i) {
				if (ss.equals(s.substring(j, i + j))) {
					count++;
				} else
					break;
			}
			if (count == s.length() / i)
				return true;
		}
		return false;
	}

	private int[] getArr(int len) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= Math.sqrt(len); i++) {
			if (len % i == 0) {
				list.add(i);
				if (len / i != i && i != 1)
					list.add(len / i);
			}
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i).intValue();
		}
		return arr;
	}
}
