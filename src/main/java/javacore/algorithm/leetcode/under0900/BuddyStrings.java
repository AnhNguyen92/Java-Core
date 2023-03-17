package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 859. Buddy Strings
 */
public class BuddyStrings {
	public boolean buddyStrings(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		if (a.length() == 1 || b.length() == 1)
			return false;
		if (a.equals(b)) {
			if ((countChar(a, "a") && countChar(b, "a")) || (countChar(a, "b") && countChar(b, "b"))
					|| (countChar(a, "c") && countChar(b, "c")) || (countChar(a, "d") && countChar(b, "dd"))
					|| (countChar(a, "e") && countChar(b, "ee")) || (countChar(a, "f") && countChar(b, "ff"))
					|| (countChar(a, "g") && countChar(b, "gg")) || (countChar(a, "h") && countChar(b, "h"))
					|| (countChar(a, "i") && countChar(b, "i")) || (countChar(a, "j") && countChar(b, "j"))
					|| (countChar(a, "l") && countChar(b, "l")) || (countChar(a, "m") && countChar(b, "m"))
					|| (countChar(a, "n") && countChar(b, "n")) || (countChar(a, "o") && countChar(b, "o"))
					|| (countChar(a, "p") && countChar(b, "p")) || (countChar(a, "q") && countChar(b, "q"))
					|| (countChar(a, "r") && countChar(b, "r")) || (countChar(a, "s") && countChar(b, "s"))
					|| (countChar(a, "t") && countChar(b, "t")) || (countChar(a, "u") && countChar(b, "u"))
					|| (countChar(a, "v") && countChar(b, "v")) || (countChar(a, "w") && countChar(b, "w"))
					|| (countChar(a, "x") && countChar(b, "x")) || (countChar(a, "y") && countChar(b, "y"))
					|| (countChar(a, "z") && countChar(b, "z"))) {
				return true;
			}
			return false;
		}
		List<String> lst = new ArrayList<>();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				if (lst.isEmpty()) {
					lst.add("" + a.charAt(i) + b.charAt(i));
				} else {
					lst.add("" + b.charAt(i) + a.charAt(i));
				}
			}
			if (lst.size() > 2) {
				return false;
			}
		}

		return ((lst.size() < 2) ? false : lst.get(0).equals(lst.get(1)));
	}

	private boolean countChar(String testString, String c) {
		return testString.length() - testString.replace(c, "").length() >= 2;
	}
}
