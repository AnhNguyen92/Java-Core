package javacore.algorithm.leetcode.under3200;

/**
 * 3121. Count the Number of Special Characters II
 */
public class CountTheNumberOfSpecialCharactersII {
    public int numberOfSpecialChars(String word) {
        int[] lower = new int[26];
        int[] upper = new int[26];
        for (int i = 0; i < 26; i++) {
            lower[i] = -1;
            upper[i] = -1;
        }
        int idx;
        for (int i = 0; i < word.length(); i++) {
            idx = word.charAt(i) - 'a';
            if (idx >= 0) {
                lower[idx] = i;
            } else {
                idx += 32;
                if (upper[idx] == -1) {
                    upper[idx] = i;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (lower[i] > -1 && lower[i] < upper[i]) {
                ans++;
            }
        }
        return ans;
    }
}
