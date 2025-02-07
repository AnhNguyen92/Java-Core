package javacore.algorithm.leetcode.under3500;

/**
 * 3443. Maximum Manhattan Distance After K Changes
 */
public class MaximumManhattanDistanceAfterKChanges {
    public int maxDistance(String s, int k) {
        int ans = 0, ncnt = 0, scnt = 0, ecnt = 0, wcnt = 0;
        int max1, max2, min1, min2;
        for (char c : s.toCharArray()) {
            if (c == 'N')       ncnt++;
            else if (c == 'S')  scnt++;
            else if (c == 'E')  ecnt++;
            else if (c == 'W')  wcnt++;
            if (ncnt >= scnt) {
                max1 = ncnt;
                min1 = scnt;
            } else {
                max1 = scnt;
                min1 = ncnt;
            }
            if (ecnt >= wcnt) {
                max2 = ecnt;
                min2 = wcnt;
            } else {
                max2= wcnt;
                min2 = ecnt;
            }
            ans = Math.max(ans, max1 + max2 - min1 - min2 + 2 * Math.min(k, min1 + min2));
        }
        return ans;
    }
}
