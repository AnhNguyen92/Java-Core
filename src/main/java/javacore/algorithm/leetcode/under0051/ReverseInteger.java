package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 7. Reverse Integer
 */
public class ReverseInteger {
	public int reverse(int x) {
        return x >= 0 ? reverseX(x) : (-reverseX(-1 * x));
    }
    
    private int reverseX(int x) {
		long a = 0;
		while (x > 0) {
			a = a * 10 + x % 10;
			x /= 10;
		}
        if (a > Integer.MAX_VALUE) {
            return 0;
        }
		return (int) a;
	}
}
