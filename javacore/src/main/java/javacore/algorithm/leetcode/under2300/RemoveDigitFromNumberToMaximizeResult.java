package javacore.algorithm.leetcode.under2300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * LeetCode 2259
 */
public class RemoveDigitFromNumberToMaximizeResult {
	public String removeDigit(String number, char digit) {
		List<String> lst = addParts(number, digit);
		while (lst.size() > 1) {
			int size = lst.size();
			for (int ii = size - 1; ii >= 1; ii--) {
				for (int i = 0; i < lst.get(0).length(); i++) {
					char cmax = lst.get(0).charAt(i);
					char c = lst.get(ii).charAt(i);
					if (cmax != c) {
						if (cmax < c) {
							Collections.swap(lst, 0, ii);
							cmax = c;
						}
						lst.remove(ii);
					}
				}
			}
		}
		return lst.get(0);
	}

	// solution 2
	public String removeDigit2(String number, char digit) {
		List<String> lst = addParts(number, digit);
		Collections.sort(lst);
		return lst.get(lst.size() - 1);
	}

	private List<String> addParts(String number, char digit) {
		List<String> lst = new ArrayList<>();

		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) == digit) {
				StringBuilder sb = new StringBuilder(number);
				String s = sb.deleteCharAt(i).toString();
				if (!lst.contains(s)) {
					lst.add(s);
				}
			}
		}
		return lst;
	}

}
