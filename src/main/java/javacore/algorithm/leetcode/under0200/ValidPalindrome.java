package javacore.algorithm.leetcode.under0200;

/*
 *  LeetCode 125. Valid Palindrome
 */
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        StringBuilder str = new StringBuilder();
        StringBuilder reverseStr = new StringBuilder();
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
