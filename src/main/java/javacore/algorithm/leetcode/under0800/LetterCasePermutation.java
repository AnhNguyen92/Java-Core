package javacore.algorithm.leetcode.under0800;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 784. Letter Case Permutation
 */
public class LetterCasePermutation {
	List<String> ans = new ArrayList<>();

	public List<String> letterCasePermutation(String s) {
		permutation(s, "", 0);
		return ans;
	}

	private void permutation(String s, String p, int i) {
		if (i == s.length() - 1) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				ans.add(p + c);
			} else {
				ans.add(p + Character.toLowerCase(c));
				ans.add(p + Character.toUpperCase(c));
			}
		} else {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				permutation(s, p + c, i + 1);
			} else {
				permutation(s, p + Character.toLowerCase(c), i + 1);
				permutation(s, p + Character.toUpperCase(c), i + 1);
			}
		}
	}
}
