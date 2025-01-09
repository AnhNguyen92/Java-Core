package javacore.algorithm.leetcode.under1400;

/**
 * 1328. Break a Palindrome
 */
public class BreakAPalindrome {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1) {
            return "";
        }
        char[] arr = palindrome.toCharArray();
        for (int i = 0; i < arr.length; i++)
            if (i != arr.length / 2 && arr[i] != 'a') {
                arr[i] = 'a';
                return new String(arr);
            }

        arr[arr.length - 1] = 'b';
        return new String(arr);
    }
}
