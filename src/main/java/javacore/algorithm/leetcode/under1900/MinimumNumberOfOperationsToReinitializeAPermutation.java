package javacore.algorithm.leetcode.under1900;

/**
 * 1806. Minimum Number of Operations to Reinitialize a Permutation
 */
public class MinimumNumberOfOperationsToReinitializeAPermutation {
    public int reinitializePermutation(int n) {
        int[] perm = new int[n];
        for (int i = 0; i < n; i++)
            perm[i] = i;
        int count = 1;
        for (; count <= n; count++) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    arr[i] = perm[i / 2];
                } else {
                    arr[i] = perm[n / 2 + (i - 1) / 2];
                }
            }
            perm = arr;
            if (initial(perm))
                break;
        }
        return count;
    }

    private boolean initial(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != i)
                return false;
        return true;
    }
}
