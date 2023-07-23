package javacore.algorithm.leetcode.under1000;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 986. Interval List Intersections
 */
public class IntervalListIntersections {
	public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0;
        int j = 0;
        List<int[]> lst = new ArrayList<>();
        int a, b, c, d;
        while (i < firstList.length && j < secondList.length) {
            a = firstList[i][0];
            b = firstList[i][1];
            c = secondList[j][0];
            d = secondList[j][1];
            if (a > d) {
                j++;
            } else if (c > b) {
                i++;
            } else {
                lst.add(new int[]{ Math.max(a, c), Math.min(b, d) });
                if (b < d) {
                    i++;
                } else if (b > d) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
        }
        int[][] arr = new int[lst.size()][2];
        for (i = 0; i < arr.length; i++) {
            arr[i] = lst.get(i);
        }
        return arr;
    }
}
