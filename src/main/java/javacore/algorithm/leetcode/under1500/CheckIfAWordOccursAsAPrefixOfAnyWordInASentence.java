package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
	public int isPrefixOfWord(String sentence, String searchWord) {
		String[] arr = sentence.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (word.indexOf(searchWord) == 0) {
				return i + 1;
			}
		}
		return -1;
	}
}
