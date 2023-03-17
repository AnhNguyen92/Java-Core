package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2391. Minimum Amount of Time to Collect Garbage
 */
public class MinimumAmountOfTimeToCollectGarbage {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans = 0;
        int lG = -1;
        int lP = -1;
        int lM = -1;
        for (int i = 0; i < garbage.length; i++) {
            ans += garbage[i].length();
            for (char c : garbage[i].toCharArray()) {
                if (c == 'G') {
                    lG = i;
                }
                if (c == 'P') {
                    lP = i;
                }
                if (c == 'M') {
                    lM = i;
                }
            }
        }
        for (int i = 1; i < travel.length; i++) {
            travel[i] += travel[i-1];
        }
        if (lG > 0) {
            ans += travel[lG-1];
        }
        if (lP > 0) {
            ans += travel[lP-1];
        }
        if (lM > 0) {
            ans += travel[lM-1];
        }

        return ans;
    }
}
