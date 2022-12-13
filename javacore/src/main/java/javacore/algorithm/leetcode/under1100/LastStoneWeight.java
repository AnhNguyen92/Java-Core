package javacore.algorithm.leetcode.under1100;

import java.util.Arrays;

/*
 * LeetCode 1046. Last Stone Weight
 */
public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[stones.length-1];
        }
        boolean notFound = true;
        int len = stones.length - 1;
        while (notFound) {
            Arrays.sort(stones);
            if (stones[len-1] == 0) {
                notFound = false;
            } else {
                stones[len] -= stones[len-1];
                stones[len - 1] = 0;
            }
        }
        return stones[stones.length-1];
    }
}
