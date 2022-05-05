package javacore.algorithm.leetcode.under400;

/*
 * LeetCode 344
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
