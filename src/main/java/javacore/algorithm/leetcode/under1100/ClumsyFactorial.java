package javacore.algorithm.leetcode.under1100;

import java.util.ArrayList;
import java.util.List;

/**
 * 1006. Clumsy Factorial
 */
public class ClumsyFactorial {
    public int clumsy(int n) {
        List<Integer> lst = new ArrayList<>();
        for (int i = n; i >= 1; i -= 4) {
            int a = i;
            for (int j = i - 1; j >= Math.max(1, i - 4); j--) {
                if (j == i - 1)
                    a *= j;
                else if (j == i - 2)
                    a /= j;
                else if (j == i - 3)
                    if (j == n - 3)
                        a += j;
                    else
                        a -= j;
            }
            lst.add(a);
        }
        int res = lst.get(0);

        for (int i = 1; i < lst.size(); i++) {
            res -= lst.get(i);
        }
        return res;
    }
}
