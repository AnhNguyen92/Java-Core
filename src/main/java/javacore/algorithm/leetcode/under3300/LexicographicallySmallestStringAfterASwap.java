package javacore.algorithm.leetcode.under3300;

/**
 * 3216. Lexicographically Smallest String After a Swap
 */
public class LexicographicallySmallestStringAfterASwap {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        int a, b;
        for (int i = 0; i < arr.length - 1; i++) {
            a = (arr[i] - '0');
            b = (arr[i + 1] - '0');
            if (a > b && a % 2 == b % 2) {
                char c = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = c;
                break;
            }
        }
        return new String(arr);
    }
}
