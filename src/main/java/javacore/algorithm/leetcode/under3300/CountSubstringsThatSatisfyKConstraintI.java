package javacore.algorithm.leetcode.under3300;

/**
 * 3258. Count Substrings That Satisfy K-Constraint I
 */
public class CountSubstringsThatSatisfyKConstraintI {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = 0;
            int y = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    x++;
                } else {
                    y++;
                }
                if (x > k && y > k) {
                    break;
                } else {
                    count++;
                }
            }
        }
        return count;
    }
}
