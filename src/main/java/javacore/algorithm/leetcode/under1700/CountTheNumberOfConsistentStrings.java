package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1684. Count the Number of Consistent Strings
 */
public class CountTheNumberOfConsistentStrings {
	public int countConsistentStrings(String allowed, String[] words) {
        char[] arr = allowed.toCharArray();
        boolean iscontain = true;
        int count = 0;
        for (String word : words) {
            iscontain = true;
            for (char c : word.toCharArray()) {
                iscontain = indexOfIntArray(arr, c);
                if (!iscontain) {
                    break;
                }
            }
            if (iscontain) {
                count++;
            }
        }
        return count;
    }
 
    public boolean indexOfIntArray(char[] array, char c) {
        for (int i = 0; i < array.length; ++i) {
            if (c == array[i]) {
                return true;
            }
        }
        return false;
    }
}
