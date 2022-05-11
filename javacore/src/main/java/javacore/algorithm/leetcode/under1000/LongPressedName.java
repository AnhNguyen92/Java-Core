package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 925
*/
public class LongPressedName {
	public boolean isLongPressedName(String name, String typed) {
		int i = 0;
		int j = 0;
		int nlen = name.length();
		int tlen = typed.length();
		while (i < nlen && j < tlen) {
			if (name.charAt(i) == typed.charAt(j)) {
				i++;
				j++;
			} else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
				j++;
			} else {
				return false;
			}
		}
		while (j < tlen && typed.charAt(j) == name.charAt(i - 1)) {
			j++;
		}
		return i == nlen && j == tlen;
	}
}
