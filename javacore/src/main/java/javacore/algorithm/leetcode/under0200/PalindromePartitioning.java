package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 131
 */
public class PalindromePartitioning {
	
	public List<List<String>> partition(String s) {
		List<List<String>> ans = new ArrayList<>();
		List<String> item = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			String str = s.substring(0, i + 1);
			if (isPalindrome(str)) {
				item.add(str);
				travel(ans, item, s, str.length(), i + 1);
				item.remove(item.size() - 1);
			}
		}

		return ans;
	}

	private void travel(List<List<String>> lst, List<String> item, String s, int size, int start) {
		if (size == s.length()) {
			lst.add(new ArrayList<>(item));
		}
		for (int i = start; i < s.length(); i++) {
			String str = s.substring(start, i + 1);
			if (isPalindrome(str)) {
				item.add(str);
				travel(lst, item, s, size + str.length(), i + 1);
				item.remove(item.size() - 1);
			}
		}
	}

	private boolean isPalindrome(String str) {
		int last = str.length() - 1;
		for (int i = 0; i <= last / 2; i++) {
			if (str.charAt(i) != str.charAt(last - i))
				return false;
		}
		return true;
	}
}
