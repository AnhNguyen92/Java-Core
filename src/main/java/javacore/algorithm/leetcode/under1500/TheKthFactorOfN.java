package javacore.algorithm.leetcode.under1500;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * LeetCode 1492. The kth Factor of n
 */
public class TheKthFactorOfN {
	public int kthFactor(int n, int k) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                lst.add(i);
                if (i != n/i)
                    lst.add(n/i);
            }
        }
        Collections.sort(lst);
        return k <= lst.size() ? lst.get(k -1) : -1;
    }
}
