package javacore.algorithm.leetcode.under0300;

import java.util.ArrayList;
import java.util.List;

/*
 * Leet code 228
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j < nums.length && (nums[j] - nums[i]) / 1 == (j-i)) {
                j++;
            }
            if ((j - i) != 1) res.add("" + nums[i] + "->" + nums[j-1]);
            else        res.add("" + nums[i]);
            i= j-1;
        }
        return res;
    }
}
