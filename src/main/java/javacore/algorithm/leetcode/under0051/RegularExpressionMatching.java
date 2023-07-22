package javacore.algorithm.leetcode.under0051;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * LeetCode 10. Regular Expression Matching
 */
public class RegularExpressionMatching {
	public boolean isMatch(String s, String p) {
		Pattern pattern = Pattern.compile(p);
		Matcher m = pattern.matcher(s);
		return m.matches();
	}
}
