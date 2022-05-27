package javacore.algorithm.leetcode.under1900;

/*
 * Leetcode 1832
 */
public class CheckIfTheSentenceIsPangram {
	public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        for (char c : sentence.toCharArray()) {
            arr[c - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
