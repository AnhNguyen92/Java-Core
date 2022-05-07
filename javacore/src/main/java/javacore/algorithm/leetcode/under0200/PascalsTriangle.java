package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 118
 */
public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		if (numRows == 0)
			return result;

		List<Integer> prev = new ArrayList<>();
		prev.add(1);
		result.add(new ArrayList<>(prev));
		int n = numRows - 1;
		while (n > 0) {

			List<Integer> list = new ArrayList<>();
			if (prev.size() >= 1)
				list.add(prev.get(0));

			for (int i = 1; i < prev.size(); i++) {
				list.add(prev.get(i - 1) + prev.get(i));
			}

			if (prev.size() >= 1)
				list.add(prev.get(prev.size() - 1));

			result.add(new ArrayList<>(list));
			prev = list;
			n--;
		}

		return result;
	}
}
