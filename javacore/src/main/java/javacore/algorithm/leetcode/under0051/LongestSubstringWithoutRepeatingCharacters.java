package javacore.algorithm.leetcode.under0051;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 3
 */
public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		Set<Character> set;
		int max = 0;
		int len;
		for (int i = 0; i < s.length(); i++) {
			set = new HashSet<>();
			for (int j = i; j < s.length(); j++) {
				len = set.size();
				set.add(s.charAt(j));
				if (set.size() == len) {
					break;
				}
			}
			if (set.size() > max) {
				max = set.size();

			}
		}
		return max;
	}

}
