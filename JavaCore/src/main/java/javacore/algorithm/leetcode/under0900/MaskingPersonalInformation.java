package javacore.algorithm.leetcode.under0900;

/*
 * LeetCode 831. Masking Personal Information
 */
public class MaskingPersonalInformation {
	public String maskPII(String s) {
        StringBuilder sb = new StringBuilder();
        char c;
        s = s.toLowerCase();
        if (s.contains("@")) {
        	sb.append(Character.toLowerCase(s.charAt(0)));
        	sb.append("******");
        	int i = 1;
        	for (; i < s.length(); i++) {
        		if (s.charAt(i) == '@') {
        			sb.append(s.charAt(i-1));
        			sb.append(s.substring(i).toLowerCase());
        			break;
        		}
        	}
            return sb.toString();
        }
        
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c != '+' && c != '-' && c != '(' && c != ')' && c != ' ') {
                sb.append(c);
            }
        }
        int n = sb.length();
        String sub = sb.substring(n - 4);
		if (n == 10) {
            return "***-***-" + sub;
        }
        if (n == 11) {
            return "+*-***-***-" + sub;
        }
        if (n == 12) {
            return "+**-***-***-" + sub;
        }
        return "+***-***-***-" + sub;
    }
	
}
