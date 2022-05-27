package javacore.algorithm.leetcode.under1800;

/*
 * Leetcode 1790
 */
public class CheckIfOneStringSwapCanMakeStringsEqual {
	public boolean areAlmostEqual(String s1, String s2) {
		int count = 0;
		int left = -1;
		int right = -1;
		for (int i = 0; i < s2.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				count++;
				if (count == 1) {
					left = i;
				} else if (count == 2) {
					right = i;
				} else {
					return false;
				}
			}
		}
		if (count == 1) {
			return false;
		}
		if (count == 0) {
			return true;
		}
		return s1.charAt(right) == s2.charAt(left) && s1.charAt(left) == s2.charAt(right);
	}
}
