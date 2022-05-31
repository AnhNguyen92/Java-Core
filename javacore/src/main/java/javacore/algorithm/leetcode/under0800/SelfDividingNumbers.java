package javacore.algorithm.leetcode.under0800;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 728
 */
public class SelfDividingNumbers {
	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDivingNumbers(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
    
    private boolean isSelfDivingNumbers(int n) {
        int a = n;
        int temp = a % 10;
        while (a > 0) {
            temp = a % 10;
            if (temp != 0 && n % temp == 0) {
                a /= 10;
            } else {
                return false;
            }
        }
        return true;
    }
}
