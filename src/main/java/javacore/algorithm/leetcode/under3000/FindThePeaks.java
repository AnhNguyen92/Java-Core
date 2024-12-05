package javacore.algorithm.leetcode.under3000;

import java.util.ArrayList;
import java.util.List;

/**
 * 2951. Find the Peaks
 */
public class FindThePeaks {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if ((mountain[i] > mountain[i - 1]) && (mountain[i] > mountain[i + 1])) {
                lst.add(i);
            }
        }
        return lst;
    }
}
