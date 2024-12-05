package javacore.algorithm.leetcode.under2900;

import java.util.ArrayList;
import java.util.List;

/**
 * 2899. Last Visited Integers
 */
public class LastVisitedIntegers {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int k = 0;
        for (int num : nums) {
            if (num > 0) {
                k = 0;
                seen.add(0, num);
            } else {
                k++;
                if (k <= seen.size()) {
                    ans.add(seen.get(k - 1));
                } else {
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}
