package javacore.algorithm.leetcode.under1500;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1451. Rearrange Words in a Sentence
 */
public class RearrangeWordsInASentence {
    public String arrangeWords(String text) {
        String[] arr = text.split(" ");
        arr[0] = arr[0].toLowerCase();
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        StringBuilder sb = new StringBuilder(arr[0].substring(0, 1).toUpperCase() + arr[0].substring(1));
        for (int i = 1; i < arr.length; i++) {
            sb.append(" ").append(arr[i]);
        }
        return sb.toString();
    }
}
