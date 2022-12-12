package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 830. Positions of Large Groups
 */
public class PositionsOfLargeGroups {
	public List<List<Integer>> largeGroupPositions(String s) {
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i <= s.length() - 3;) {
			char c = s.charAt(i);
            int j = i;
			while (j < s.length() && s.charAt(j) == c) {
				j++;
			}
			if (j - i >= 3) {
				List<Integer> item = new ArrayList<>();
				item.add(i);
				item.add(j - 1);
				ans.add(item);
			}
            i = j;
		}
		return ans;
	}

}
