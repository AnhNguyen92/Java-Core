package javacore.algorithm.leetcode.under1600;

/**
 * 1541. Minimum Insertions to Balance a Parentheses String
 */
public class MinimumInsertionsToBalanceAParenthesesString {
    public int minInsertions(String s) {
        int left = 0;
        int count = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (count == 1) {
                    if (left > 0) {
                        left--;
                        ans++;
                    } else {
                        ans += 2;
                    }
                }
                left++;
                count = 0;
            } else {
                count++;
                if (count == 2) {
                    if (left == 0) {
                        ans++;
                    } else {
                        left--;
                    }
                    count = 0;
                } else if (i == s.length() - 1) {
                    if (left > 0) {
                        left--;
                        ans++;
                    } else {
                        ans += 2;
                    }
                }
            }
        }
        return ans + left * 2;
    }

}
