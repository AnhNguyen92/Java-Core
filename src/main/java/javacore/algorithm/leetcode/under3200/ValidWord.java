package javacore.algorithm.leetcode.under3200;

/**
 * 3136. Valid Word
 */
public class ValidWord {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean vowel = false;
        boolean consonant = false;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                char x = Character.toLowerCase(c);
                if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                    vowel = true;
                } else {
                    consonant = true;
                }
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return vowel && consonant;
    }
}
