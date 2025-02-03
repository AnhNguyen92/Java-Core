package javacore.algorithm.leetcode.under1800;

/**
 * 1754. Largest Merge Of Two Strings
 */
public class LargestMergeOfTwoStrings {
    public String largestMerge(String w1, String w2) {
        if (w1.isEmpty() || w2.isEmpty()) {
            return w2 + w1;
        }
        if (w1.compareTo(w2) >= 0) {
            return w1.charAt(0) + largestMerge(w1.substring(1), w2);
        }
        return w2.charAt(0) + largestMerge(w1, w2.substring(1));
    }
}
