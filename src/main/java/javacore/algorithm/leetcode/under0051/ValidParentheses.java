package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 20. Valid Parentheses
 */
public class ValidParentheses {
	public boolean isValid(String s) {
		boolean isValid = true;
		StringBuilder builder = new StringBuilder();
		int i = 0;
		while (i < s.length() && isValid) {
			char c = s.charAt(i);
			switch (c) {
			case '(':
				builder.append("(");
				break;
			case ')':
				if (!builder.isEmpty() && builder.charAt(builder.length() - 1) == '(') {
					builder.deleteCharAt(builder.length() - 1);
				} else {
					isValid = false;
				}
				break;
			case '{':
				builder.append("{");
				break;
			case '}':
				if (!builder.isEmpty() && builder.charAt(builder.length() - 1) == '{') {
					builder.deleteCharAt(builder.length() - 1);
				} else {
					isValid = false;
				}
				break;
			case '[':
				builder.append("[");
				break;
			case ']':
				if (!builder.isEmpty() && builder.charAt(builder.length() - 1) == '[') {
					builder.deleteCharAt(builder.length() - 1);
				} else {
					isValid = false;
				}
				break;
			default:
				break;
			}
			i++;
		}
		return (isValid && builder.toString().isEmpty());
	}
}
