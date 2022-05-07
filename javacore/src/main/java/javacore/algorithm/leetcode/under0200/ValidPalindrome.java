package javacore.algorithm.leetcode.under0200;

/*
 *  Leetcode 125
 */
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        StringBuilder str = new StringBuilder("");
        StringBuilder reverseStr = new StringBuilder("");
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c)) {
                str.append(c);
                reverseStr.insert(0, c);
            }
        }
        return str.toString().equalsIgnoreCase(reverseStr.toString());
    }
}
