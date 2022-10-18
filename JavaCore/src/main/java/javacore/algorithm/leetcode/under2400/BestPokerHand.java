package javacore.algorithm.leetcode.under2400;

import java.util.Arrays;

/*
 * LeetCode 2347
 */
public class BestPokerHand {
    public String bestHand(int[] ranks, char[] suits) {
        int count = 1;
        for (int i = 1; i < 5; i++) {
            if (suits[i] == suits[0]) {
                count++;
            } else {
                break;
            }
        }
        if (count == 5)
            return "Flush";
        Arrays.sort(ranks);
        count = 1;
        int max = 0;
        for (int i = 1; i < ranks.length; i++) {
            if (ranks[i] == ranks[i - 1]) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        if (max >= 3)
            return "Three of a Kind";
        else if (max == 2)
            return "Pair";
        return "High Card";
    }
}
