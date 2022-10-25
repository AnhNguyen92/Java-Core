package javacore.algorithm.leetcode.under2400;

public class FirstLettetToAppearTwice {
	public char repeatedCharacter(String s) {
        int[] alpha = new int[26];
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            alpha[c - 'a']++;
            if (alpha[c - 'a'] == 2) {
                return  c;
            }
        }
        return 'a';
    }
}
