package javacore.algorithm.leetcode.under0500;

import java.util.HashMap;
import java.util.Map;

/**
 * 454. 4Sum II
 */
public class FourSumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        int n = nums1.length;
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        Map<Integer, Integer> m3 = new HashMap<>();
        Map<Integer, Integer> m4 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            m1.merge(nums1[i], 1, Integer::sum);
            m2.merge(nums2[i], 1, Integer::sum);
            m3.merge(nums3[i], 1, Integer::sum);
            m4.merge(nums4[i], 1, Integer::sum);
        }
        Map<Integer, Integer> m5 = new HashMap<>();
        Map<Integer, Integer> m6 = new HashMap<>();
        for (int i : m1.keySet()) {
            for (int j : m2.keySet()) {
                m5.merge(i + j, m1.get(i) * m2.get(j), Integer::sum);
            }
        }
        for (int k : m3.keySet()) {
            for (int l : m4.keySet()) {
                m6.merge(k + l, m3.get(k) * m4.get(l), Integer::sum);
            }
        }
        for (int k : m5.keySet()) {
            if (m6.get(-k) != null) {
                count += m5.get(k) * m6.get(-k);
            }
        }
        return count;
    }
}
