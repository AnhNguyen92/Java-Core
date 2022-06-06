package javacore.algorithm.leetcode.under1200;

/*
 * LeetCode 1175
 */
public class PrimeArrangements {
	public int numPrimeArrangements(int n) {
        int prime = countPrimes(n+1);
        int composite = n - prime;
        long ans = 1;
        for (int i = prime; i >= 2; i--) {
            ans = ans * i % 1000000007;
        }
        for (int i = composite; i >= 2; i--) {
            ans = ans * i % 1000000007;
        }
        return (int) ans;
    }
    
    public int countPrimes(int n) {
        boolean[] isprime = new boolean[n];
		int count = 0;

		for (int i = 2; i * i <= n; i++) {
			if (!isprime[i]) {
				for (int j = i * 2; j < n; j += i) {
					isprime[j] = true;
				}
			}
		}
		for (int i = 2; i < isprime.length; i++) {
			if (!isprime[i]) {
				count++;
			}
		}
		return count;
    }
}
