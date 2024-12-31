package javacore.algorithm.leetcode.under2100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2013. Detect Squares
 */
public class DetectSquares {
    Map<String, Integer> counter;
    List<int[]> lst;

    public DetectSquares() {
        counter = new HashMap<>();
        lst = new ArrayList<>();
    }

    public void add(int[] point) {
        if (!counter.containsKey(point[0] + "-" + point[1])) {
            lst.add(point);
        }
        counter.merge(point[0]+"-"+point[1], 1, Integer::sum);
    }

    public int count(int[] point) {
        List<int[]> lst1 = new ArrayList<>();
        List<int[]> lst2 = new ArrayList<>();
        int count = 0;
        for (int[] arr : lst) {
            if (arr[0] == point[0]) {
                lst1.add(arr);
            } else if (arr[1] == point[1]) {
                lst2.add(arr);
            }
        }
        for (int[] ar1 : lst1) {
            int a = Math.abs(point[1] - ar1[1]);
            for (int[] ar2 : lst2) {
                int b = Math.abs(point[0] - ar2[0]);
                if (a == b) {

                    int[] ar3 = new int[] {ar2[0], ar1[1]};
                    if (counter.containsKey(ar3[0]+"-"+ar3[1])) {
                        count += counter.get(ar1[0]+"-"+ar1[1]) * counter.get(ar2[0]+"-"+ar2[1]) * counter.get(ar3[0]+"-"+ar3[1]);
                    }
                }
            }
        }
        return count;
    }
}
