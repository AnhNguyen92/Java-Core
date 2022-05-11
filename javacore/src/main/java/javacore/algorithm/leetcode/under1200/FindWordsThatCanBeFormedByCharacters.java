package javacore.algorithm.leetcode.under1200;

/*
 * LeetCode 1160
 */
public class FindWordsThatCanBeFormedByCharacters {
	public int countCharacters(String[] words, String chars) {
        int sum = 0;
        int[] arr= new int[26];
        for (char c : chars.toCharArray()) {
            arr[c - 'a']++;
        }
        int len = chars.length();
        for (String word : words) {
            if (word.length() <= len) {
            	boolean match = true;
                int[] temp = new int[26];
                System.arraycopy(arr, 0, temp, 0, arr.length);
                for (char c: word.toCharArray()) {
                    int i = c - 'a';
                    temp[i]--;
                    if (temp[i] < 0) {
                        match = false;
                        break;
                    }
                }
                if (match) {                	
                	sum += word.length();
                }
            }
        }
        return sum;
    }
}
