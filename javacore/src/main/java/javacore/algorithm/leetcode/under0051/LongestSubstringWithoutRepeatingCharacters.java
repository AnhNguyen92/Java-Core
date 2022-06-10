package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 3
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		List<Character> lst = new ArrayList<>();
		int max = 0;
		int i = 0;
		while (i < s.length()) {
			while (i < s.length() && !lst.contains(s.charAt(i))) {
				lst.add(s.charAt(i++));
			}
			if (max < lst.size())
                max = lst.size();
			lst.remove(0);
		}
		return max;
	}

}
