package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 917. Reverse Only Letters
 */
public class ReverseOnlyLetters {
	public String reverseOnlyLetters(String s) {
		StringBuilder sb1 = new StringBuilder("");
		StringBuilder sb2 = new StringBuilder("");
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			if (!Character.isLetter(s.charAt(i))) {
				sb1.append(s.charAt(i));
				i++;
			} else if (!Character.isLetter(s.charAt(j))) {
				sb2.append(s.charAt(j));
				j--;
			} else if (i < j) {
				sb2.append(s.charAt(i++));
				sb1.append(s.charAt(j--));

			} else {
				sb2.append(s.charAt(i++));
			}
		}
		return sb1.append(sb2.reverse()).toString();
	}
}
