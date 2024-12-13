package javacore.algorithm.leetcode.under1300;

/**
 * 1208. Get Equal Substrings Within Budget
 */
public class GetEqualSubstringsWithinBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int currCost = 0;
            int j = i;
            for (; j < n; j++) {
                int cost = Math.abs(s.charAt(j) - t.charAt(j));
                if (cost + currCost <= maxCost)
                    currCost += cost;
                else
                    break;
            }
            ans = Math.max(ans, j - i);
        }
        return ans;
    }
}
