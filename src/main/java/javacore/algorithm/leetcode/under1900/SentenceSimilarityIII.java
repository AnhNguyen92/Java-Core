package javacore.algorithm.leetcode.under1900;

/**
 * 1813. Sentence Similarity III
 */
public class SentenceSimilarityIII {
    public boolean areSentencesSimilar(String s1, String s2) {
        int start = 0;
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        int m = arr1.length;
        int n = arr2.length;
        for (int i = 0; i < Math.min(m, n); i++) {
            if (!arr1[i].equals(arr2[i]))
                break;
            start++;
        }
        if (start == Math.min(m, n))
            return true;
        int end = 0;
        for (int i = m - 1, j = n - 1; i >= 0 && j >= 0; i--, j--) {
            if (!arr1[i].equals(arr2[j]))
                break;
            end++;
        }
        return (end >= Math.min(m, n) || end + start >= n || end + start >= m);
    }
}
