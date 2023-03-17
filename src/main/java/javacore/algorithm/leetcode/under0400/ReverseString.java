package javacore.algorithm.leetcode.under0400;

/*
 * LeetCode 344. Reverse String
*/
public class ReverseString {
	public void reverseString(char[] s) {
        char c;
        for (int i = 0; i <= s.length / 2 - 1; i++) {
            c = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = c;
        }
    }
}
