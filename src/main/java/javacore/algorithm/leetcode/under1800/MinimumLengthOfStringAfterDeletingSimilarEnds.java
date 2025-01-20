package javacore.algorithm.leetcode.under1800;

/**
 * 1750. Minimum Length of String After Deleting Similar Ends
 */
public class MinimumLengthOfStringAfterDeletingSimilarEnds {
    public int minimumLength(String s) {
        int l = 0;
        char[] arr = s.toCharArray();
        int r = arr.length - 1;
        while (l < r && arr[l] == arr[r]) {
            char c = arr[l];
            while (l + 1 < arr.length && arr[l] == c) {
                l++;
            }
            c = arr[r];
            while (r >= 1 && arr[r] == c)
                r--;
        }
        if (r < l)
            return 0;
        return r - l + 1;
    }
}
