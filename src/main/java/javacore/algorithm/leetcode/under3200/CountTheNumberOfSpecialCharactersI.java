package javacore.algorithm.leetcode.under3200;

/**
 * 3120. Count the Number of Special Characters I
 */
public class CountTheNumberOfSpecialCharactersI {
    public int numberOfSpecialChars(String word) {
        int[] arr = new int[58];
        for (char c : word.toCharArray()) {
            arr[c - 'A']++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] * arr[i + 32] > 0) {
                count++;
            }
        }
        return count;
    }
}
