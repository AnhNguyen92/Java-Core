package javacore.algorithm.leetcode.under0700;

import java.util.ArrayList;
import java.util.List;

/**
 * 658. Find K Closest Elements
 */
public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> lst = new ArrayList<>();
        int l = 0;
        int r = arr.length - 1;
        if (arr[0] > x)
            l = 0;
        else if (arr[r] < x)
            l = arr.length - k;
        else
            while (r - l >= k) {
                if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) {
                    r--;
                } else {
                    l++;
                }
            }
        for (int i = l; i < l+k; i++) {
            lst.add(arr[i]);
        }
        return lst;
    }
}
