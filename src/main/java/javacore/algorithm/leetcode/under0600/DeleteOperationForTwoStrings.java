package javacore.algorithm.leetcode.under0600;

/**
 * 583. Delete Operation for Two Strings
 */
public class DeleteOperationForTwoStrings {
    public int minDistance(String word1, String word2) {
        return word1.length() + word2.length() - 2 * longestCommonSubsequence(word1, word2);
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1;
                    if (i > 0 && j > 0) {
                        dp[i][j] += dp[i - 1][j - 1];
                    }
                } else {
                    if (i > 0) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                    }
                    if (j > 0) {
                        dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
                    }
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
