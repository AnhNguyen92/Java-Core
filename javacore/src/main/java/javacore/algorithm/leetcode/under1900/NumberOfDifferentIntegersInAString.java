package javacore.algorithm.leetcode.under1900;

import java.util.HashSet;
import java.util.Set;

/*
 * Leetcode 1805
 */
public class NumberOfDifferentIntegersInAString {
	public int numDifferentIntegers(String word) {
		StringBuilder sb = new StringBuilder();
		char c;
		Set<String> set = new HashSet<>();
		boolean found = false;
		for (int i = 0; i < word.length(); i++) {

			c = word.charAt(i);
			if (c >= '0' && c <= '9') {
				sb.append(c);
				if (i == word.length() - 1) {
					found = true;
				}
			} else if (sb.length() > 0) {
				found = true;
			}
			if (found) {
				found = false;
				set.add(buildStr(sb));
				sb = new StringBuilder();
			}
		}
		return set.size();
	}

	private String buildStr(StringBuilder sb) {
		while (sb.length() > 1 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}
}
