package vn.com.ids.javacore.algorithm;

public class Leetcode20 {
public static void main(String[] args) {
	String s = "]";
	boolean isValid = true;
	StringBuilder builder = new StringBuilder("");
	int i = 0;
	while (i < s.length() && isValid) {
		char c = s.charAt(i);
		switch (c) {
		case '(':
			builder.append("(");
			break;
		case ')':
			if (builder.length() > 0 && builder.charAt(builder.length() - 1) == '(') {				
				builder.deleteCharAt(builder.length() - 1);
			} else {
				isValid = false;
			}
			break;
		case '{':
			builder.append("{");
			break;
		case '}':
			if (builder.length() > 0 && builder.charAt(builder.length() - 1) == '{') {				
				builder.deleteCharAt(builder.length() - 1);
			} else {
				isValid = false;
			}
			break;
		case '[':
			builder.append("[");
			break;
		case ']':
			if (builder.length() > 0 && builder.charAt(builder.length() - 1) == '[') {				
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
	System.out.println(isValid && builder.toString().equals(""));
}
}
