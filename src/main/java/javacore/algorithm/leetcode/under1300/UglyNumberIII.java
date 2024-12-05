package javacore.algorithm.leetcode.under1300;

/**
 * 1201. Ugly Number III
 */
public class UglyNumberIII {
    public int nthUglyNumber(int n, int a, int b, int c) {
        return (int) findNthDivisible(a, b, c, n);
    }

    public long findNthDivisible(long a, long b, long c, long n) {
        long low = 1, high = 2 * n * Math.max(a, Math.max(b, c));
        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (count(mid, a, b, c) < n) {
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }

        return result;
    }

    public long gcd(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public long lcm(long x, long y) {
        return (x / gcd(x, y)) * y;
    }

    public long lcm(long a, long b, long c) {
        return lcm(lcm(a, b), c);
    }

    public long count(long x, long a, long b, long c) {
        return (x / a) + (x / b) + (x / c)
                - (x / lcm(a, b)) - (x / lcm(a, c)) - (x / lcm(b, c))
                + (x / lcm(a, b, c));
    }
}
