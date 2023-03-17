package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2264. Largest 3-Same-Digit Number in String
*/
public class Largest3SameDigitNumberInString {
	public String largestGoodInteger(String num) {
		int max = -1;
		char c1;
		int c2;
		for (int i = 0; i <= num.length() - 3; i++) {
			c1 = num.charAt(i);
			c2 = num.charAt(i + 1);
			if (c1 == c2) {
				if (c1 == num.charAt(i + 2)) {
					int n = c1 - '0';
					if (n > max) {
						max = n;
					}
					i = i + 2;
				} else {
					i++;
				}
			}
		}
		if (max == 0)
			return "000";
		return (max > 0) ? ("" + 111 * max) : "";
	}
}
