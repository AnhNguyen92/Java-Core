package javacore.algorithm.leetcode.under2200;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2178. Maximum Split of Positive Even Integers
 */
public class MaximumSplitOfPositiveEvenIntegers {
	public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> lst = new ArrayList<>();
        if (finalSum % 2 == 0) {
            long i = 0;
            while (finalSum > 0) {
                if (finalSum > i) {
                    i += 2;
                    lst.add(i);
                } else {
                    i += finalSum;
                    lst.set(lst.size() - 1, i);
                }
                finalSum -= i;
            }
        }
        return lst;
    }
}
