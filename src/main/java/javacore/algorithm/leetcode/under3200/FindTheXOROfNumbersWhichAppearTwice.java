package javacore.algorithm.leetcode.under3200;

import java.util.ArrayList;
import java.util.List;

/**
 * 3158. Find the XOR of Numbers Which Appear Twice
 */
public class FindTheXOROfNumbersWhichAppearTwice {
    public int duplicateNumbersXOR(int[] nums) {
        int[] arr = new int[51];
        for (int i : nums) {
            arr[i]++;
        }
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            if (arr[i] == 2) {
                lst.add(i);
            }
        }
        if (lst.isEmpty()) return 0;
        int res = lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            res ^= lst.get(i);
        }
        return res;
    }
}
