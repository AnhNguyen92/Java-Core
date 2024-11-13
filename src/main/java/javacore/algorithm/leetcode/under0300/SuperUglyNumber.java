package javacore.algorithm.leetcode.under0300;

/**
 * 313. Super Ugly Number
 */
public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] arr = new int[n];
        arr[0] = 1;
        long min;
        int m = primes.length;
        int[] pre = new int[m];
        for (int i = 1; i < n; i++) {
            min = Long.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                min = Math.min(min, (long) arr[pre[j]] * primes[j]);
            }
            arr[i] = (int) min;
            for (int j = 0; j < m; j++) {
                if (min == (long) arr[pre[j]] * primes[j]) {
                    pre[j]++;
                }
            }
        }
        return arr[n - 1];
    }
}
