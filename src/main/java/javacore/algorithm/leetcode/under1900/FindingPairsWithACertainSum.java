package javacore.algorithm.leetcode.under1900;

import java.util.HashMap;
import java.util.Map;

/**
 * 1865. Finding Pairs With a Certain Sum
 */
public class FindingPairsWithACertainSum {
    Map<Integer, Integer> m1 = new HashMap<>();
    Map<Integer, Integer> m2 = new HashMap<>();
    int[] ar1;
    int[] ar2;
    public FindingPairsWithACertainSum(int[] nums1, int[] nums2) {
        ar1 = nums1;
        ar2 = nums2;
        for (int x : nums1)
            m1.put(x, m1.getOrDefault(x, 0) + 1);
        for (int x : nums2)
            m2.put(x, m2.getOrDefault(x, 0) + 1);
    }

    public void add(int index, int val) {
        if (m2.get(ar2[index]) == 1)
            m2.remove(ar2[index]);
        else
            m2.put(ar2[index], m2.get(ar2[index]) - 1);
        ar2[index] += val;
        m2.put(ar2[index], m2.getOrDefault(ar2[index], 0) + 1);
    }

    public int count(int tot) {
        int ans = 0;
        for (int x : m1.keySet()) {
            if (m2.get(tot - x) != null && m2.get(tot - x) > 0)
                ans += m1.get(x) * m2.get(tot - x);
        }
        return ans;
    }
}
