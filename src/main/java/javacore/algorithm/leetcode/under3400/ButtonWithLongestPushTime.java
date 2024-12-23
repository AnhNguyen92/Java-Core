package javacore.algorithm.leetcode.under3400;

/**
 * 3386. Button with Longest Push Time
 */
public class ButtonWithLongestPushTime {
    public int buttonWithLongestTime(int[][] events) {
        int max = events[0][1];
        int idx = events[0][0];
        for (int i = 1; i < events.length; i++) {
            int diff = events[i][1] - events[i-1][1];
            if (diff > max || (diff == max && idx > events[i][0])) {
                max = diff;
                idx = events[i][0];
            }
        }
        return idx;
    }
}
