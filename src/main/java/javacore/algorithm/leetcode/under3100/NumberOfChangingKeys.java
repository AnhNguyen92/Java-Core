package javacore.algorithm.leetcode.under3100;

/**
 * 3019. Number of Changing Keys
 */
public class NumberOfChangingKeys {
    public int countKeyChanges(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i + 1))) {
                count++;
            }
        }
        return count;
    }
}
