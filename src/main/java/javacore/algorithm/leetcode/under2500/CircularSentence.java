package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2490. Circular Sentence
 */
public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        int n = arr.length;
        if (arr[n - 1].charAt(arr[n - 1].length() - 1) != arr[0].charAt(0)) {
            return false;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].charAt(arr[i].length() - 1) != arr[i + 1].charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
