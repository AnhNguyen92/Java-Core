package javacore.algorithm.leetcode.under1500;

/**
 * 1497. Check If Array Pairs Are Divisible by k
 */
public class CheckIfArrayPairsAreDivisibleByK {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k + 1];
        for (int i : arr) {
            freq[((i % k) + k) % k]++;
        }
        for (int i = 1; i <= k / 2; i++) {
            if (freq[i] != freq[k - i])
                return false;
        }
        if (k % 2 == 0) {
            return freq[k / 2] % 2 == 0;
        }
        return true;
    }
}
