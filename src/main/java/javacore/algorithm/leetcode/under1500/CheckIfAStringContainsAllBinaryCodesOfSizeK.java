package javacore.algorithm.leetcode.under1500;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 1461. Check If a String Contains All Binary Codes of Size K
 */
public class CheckIfAStringContainsAllBinaryCodesOfSizeK {
	public boolean hasAllCodes(String s, int k) {
        int len = pow2(k);
        if (s.length() - k + 1 < len) 
            return false;
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            set.add(s.substring(i, i + k));
        }
        return set.size() == len;
    }
    
    private int pow2(int k) {
        if (k == 0) {
            return 1;
        }
        return 2 * pow2(k - 1);
    }
}
