package javacore.algorithm.leetcode.under0900;

/**
 * 878. Nth Magical Number
 */
public class NthMagicalNumber {
        public int nthMagicalNumber(int n, int a, int b) {
            long ans = findNthDivisible(a, b, n);
            return (int) (ans % 1000000007);
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

        public long count(long x, long a, long b) {
            return (x / a) + (x / b) - (x / lcm(a, b));
        }

        public long findNthDivisible(long a, long b, long n) {
            long low = 1, high = 2 * n * Math.max(a, b);
            long result = 0;

            while (low <= high) {
                long mid = (low + high) / 2;
                if (count(mid, a, b) < n) {
                    low = mid + 1;
                } else {
                    result = mid;
                    high = mid - 1;
                }
            }

            return result;
        }
}
