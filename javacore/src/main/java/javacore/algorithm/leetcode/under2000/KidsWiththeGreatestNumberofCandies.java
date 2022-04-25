package javacore.algorithm.leetcode.under2000;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * LeetCode 1431
*/

public class KidsWiththeGreatestNumberofCandies {
    private static final Logger logger = LoggerFactory.getLogger(KidsWiththeGreatestNumberofCandies.class);

    public static void main(String[] args) {
        int[] candies = new int[] { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        logger.info("{}", result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(Boolean.TRUE);
            } else {
                result.add(Boolean.FALSE);
            }
        }
        return result;
    }
}
