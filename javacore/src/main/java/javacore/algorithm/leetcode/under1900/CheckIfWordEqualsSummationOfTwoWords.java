package javacore.algorithm.leetcode.under1900;

/*
 * Leetcode 1880. Check if Word Equals Summation of Two Words
 */
public class CheckIfWordEqualsSummationOfTwoWords {
	public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int a = sum(firstWord);
        int b = sum(secondWord);
        int c = sum(targetWord);
        return c == a + b;
    }
    
    private int sum(String str) {
        int sum = 0;
        for(char c : str.toCharArray()) {
            sum = sum * 10 + c - 'a';
        }
        return sum;
    }
}
