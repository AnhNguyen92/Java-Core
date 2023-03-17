package javacore.algorithm.leetcode.under1800;

/*
 * LeetCode 1704. Determine if String Halves Are Alike
 */
public class DetermineIfStringHalvesAreAlike {
	public boolean halvesAreAlike(String s) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length()/2; i++) {
            if (isVowel(s.charAt(i)) ) {
                left++;
            }
        }
        for (int i = s.length()/2; i < s.length(); i++) {
            if (isVowel(s.charAt(i)) ) {
                right++;
            }
        }
        return left == right;
    }
    
    private boolean isVowel(char c) {
        return (c == 'a')
        || (c == 'e')
        || (c == 'i')
        || (c == 'o')
        || (c == 'u')
        || (c == 'A')
        || (c == 'E')
        || (c == 'I')
        || (c == 'O')
        || (c == 'U');
    }
}
