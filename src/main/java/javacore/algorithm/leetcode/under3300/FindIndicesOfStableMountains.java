package javacore.algorithm.leetcode.under3300;

import java.util.ArrayList;
import java.util.List;

/*
 * 3285. Find Indices of Stable Mountains
 * */
public class FindIndicesOfStableMountains {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                lst.add(i);
            }
        }
        return lst;
    }
}
