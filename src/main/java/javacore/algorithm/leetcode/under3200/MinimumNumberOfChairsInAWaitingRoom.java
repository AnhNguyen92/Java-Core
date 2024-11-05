package javacore.algorithm.leetcode.under3200;

/**
 * 3168. Minimum Number of Chairs in a Waiting Room
 */
public class MinimumNumberOfChairsInAWaitingRoom {
    public int minimumChairs(String s) {
        int e = 0;
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E') {
                if (l == 0) {
                    e++;
                } else {
                    l--;
                }
            } else {
                l++;
            }
        }
        return Math.max(e, l);
    }
}
