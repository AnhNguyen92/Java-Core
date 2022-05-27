package javacore.algorithm.leetcode.under1900;

/*
 * Leetcode 1837
 */
public class SumOfDigitsInBaseK {
	public int sumBase(int n, int k) {
        int temp = Integer.parseInt(Integer.toString(n, k));
        int res = 0;
        while (temp > 0) {
            res += temp % 10;
            temp /= 10;
        }
        
        return res;
    }
}
