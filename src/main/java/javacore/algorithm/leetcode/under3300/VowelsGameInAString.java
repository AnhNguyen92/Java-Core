package javacore.algorithm.leetcode.under3300;

/*
 * 3227. Vowels Game in a String
 */
public class VowelsGameInAString {
    public boolean doesAliceWin(String s) {
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return true;
            }
        }
        return false;
    }
}
