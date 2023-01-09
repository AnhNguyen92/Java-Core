package javacore.algorithm.leetcode.under1800;

/*
 * Leetcode 1768. Merge Strings Alternately
 */
public class MergeStringsAlternately {
	public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        char[] result = new char[chars1.length + chars2.length];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < chars1.length || j < chars2.length) {
            if(i < chars1.length && (i == j || j == chars2.length)) {
                result[k] = chars1[i];
                i++;
            } else {
                result[k] = chars2[j];
                j++;
            }
            
            k++;
        }
        
        return new String(result);
    }
}
