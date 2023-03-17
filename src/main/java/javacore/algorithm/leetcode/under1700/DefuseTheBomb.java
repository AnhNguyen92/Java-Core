package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1652. Defuse the Bomb
 */
public class DefuseTheBomb {
	public int[] decrypt(int[] code, int k) {
		if (k == 0)
			return new int[code.length];
		int pref[] = new int[code.length + 1];
		int res[] = new int[code.length];
		int j = 1;
		pref[0] = 0;
		int n = code.length;
		for (int i : code) {
			pref[j] = pref[j - 1] + i;
			j++;
		}
		if (k > 0) {
			for (int i = 1; i <= n; i++) {
				if (i + k <= n) {
					res[i - 1] = pref[i + k] - pref[i];
				} else {
					res[i - 1] = pref[k - n + i] + (pref[n] - pref[i]);
				}
			}
		} else if (k < 0) {
			k = Math.abs(k);
			for (int i = 1; i <= n; i++) {
				if (i - k > 0) {
					res[i - 1] = pref[i - 1] - pref[i - k - 1];
				} else {
					res[i - 1] = pref[i - 1] + (pref[n] - pref[n - k + i - 1]);
				}
			}

		}
		return res;
	}
}
