package javacore.algorithm.leetcode.under2100;

/**
 * 2063. Vowels of All Substrings
 */
public class VowelsOfAllSubstrings {
    public long countVowels(String word) {
        long ans = 0L;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                ans += (long) (i + 1) * (n - i);
            }
        }
        return ans;
    }
}
