package javacore.algorithm.leetcode.under1100;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1078. Occurrences After Bigram
 */
public class OccurrencesAfterBigram {
	public String[] findOcurrences(String text, String first, String second) {
        String[] items = text.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= items.length - 3; i++) {
            if (items[i].equals(first) && items[i+1].equals(second)) {
                list.add(items[i+2]);
            }
        }
        String[] array = new String[list.size()];
        for(int i = 0; i < list.size(); i++) 
            array[i] = list.get(i);
        return array;    
    }
}
