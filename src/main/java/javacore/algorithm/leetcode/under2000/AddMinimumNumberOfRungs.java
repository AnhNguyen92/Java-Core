package javacore.algorithm.leetcode.under2000;

/**
 * 1936. Add Minimum Number of Rungs
 */
public class AddMinimumNumberOfRungs {
    public int addRungs(int[] rungs, int dist) {
        int cur = 0;
        int count = 0;
        for (int rung : rungs) {
            if (cur + dist < rung) {
                count += (rung - cur) / dist;
                if ((rung - cur) % dist == 0)
                    count--;
            }
            cur = rung;
        }
        return count;
    }
}
