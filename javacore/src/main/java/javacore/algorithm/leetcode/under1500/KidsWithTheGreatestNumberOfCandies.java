package javacore.algorithm.leetcode.under1500;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1431
 */
public class KidsWithTheGreatestNumberOfCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]  + extraCandies >= max) {
                result.add(Boolean.TRUE);
            } else {
                result.add(Boolean.FALSE);
            }
        }
        return result; 
    }
}
