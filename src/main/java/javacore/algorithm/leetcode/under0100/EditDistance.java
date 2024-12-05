package javacore.algorithm.leetcode.under0100;

/**
 * 72. Edit Distance
 */
public class EditDistance {
    public int minDistance(String s1, String s2) {
        int lenS1 = s1.length();
        int lenS2 = s2.length();
        int[][] dp = new int[lenS1 + 1][lenS2 + 1];

        // Initialize the distance matrix
        for (int i = 0; i <= lenS1; i++) {
            dp[i][0] = i; // Deletion
        }
        for (int j = 0; j <= lenS2; j++) {
            dp[0][j] = j; // Insertion
        }

        // Fill the matrix
        for (int i = 1; i <= lenS1; i++) {
            for (int j = 1; j <= lenS2; j++) {
                int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;

                dp[i][j] = Math.min(Math.min(
                                dp[i - 1][j] + 1,    // Deletion
                                dp[i][j - 1] + 1),   // Insertion
                        dp[i - 1][j - 1] + cost); // Substitution
            }
        }

        return dp[lenS1][lenS2];
    }
}
