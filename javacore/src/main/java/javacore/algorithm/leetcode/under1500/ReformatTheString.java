package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1417
 */
public class ReformatTheString {
	public String reformat(String s) {
		if (s.length() <= 1)
			return s;
		StringBuilder sbDigit = new StringBuilder("");
		StringBuilder sbLetter = new StringBuilder("");
		for (char c : s.toCharArray()) {
			if (Character.isLetter(c))
				sbLetter.append(c);
			else
				sbDigit.append(c);
		}
		if (sbLetter.length() == 0 || sbDigit.length() == 0 || Math.abs(sbLetter.length() - sbDigit.length()) > 1)
			return "";
		StringBuilder ans = new StringBuilder("");
		while (sbLetter.length() > 0 && sbDigit.length() > 0) {
			ans.append(sbLetter.charAt(0));
			sbLetter.deleteCharAt(0);
			ans.append(sbDigit.charAt(0));
			sbDigit.deleteCharAt(0);
		}
		if (sbLetter.length() > 0) {
			ans.append(sbLetter.charAt(0));
		} else if (sbDigit.length() > 0) {
			ans.insert(0, sbDigit.charAt(0));
		}
		return ans.toString();
	}
}
