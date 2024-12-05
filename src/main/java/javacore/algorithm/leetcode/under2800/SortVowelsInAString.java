package javacore.algorithm.leetcode.under2800;

import java.util.PriorityQueue;

/**
 * 2785. Sort Vowels in a String
 */
public class SortVowelsInAString {
    public String sortVowels(String s) {
        PriorityQueue<Character> vowels = new PriorityQueue<>();
        char[] crr = s.toCharArray();
        for (char c : crr) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }

        for (int i = 0; i < crr.length; i++) {
            char c = crr[i];
            if (isVowel(c)) {
                crr[i] = vowels.poll();
            }
        }
        return new String(crr);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||  c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' ||  c == 'O' || c == 'U';
    }
}
