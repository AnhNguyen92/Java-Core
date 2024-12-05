package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 50. Pow(x, n)
 */
public class PowNTimeOfX {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        List<Double> pows = new ArrayList<>();
        
        pows.add(1.0);
        pows.add(x);
        boolean isNegative = n < 0;
        long k = n;
        if (n < 0) {
            k = (long) n * (-1);
        }
        double result = 1;
        while (k > 0) {
            if (pows.size() <= k) {
                pows.add(x * pows.get(pows.size() - 1));
                result *= pows.get(pows.size() - 1);
                k -= pows.size() - 1;
            } else {
                result *= pows.get((int) k);
                k = 0;
            }
        }

        if (isNegative) {
            result = 1.0 / result;
        }

        return result;
    }
}
