package javacore.algorithm.leetcode.under1000;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode 937. Reorder Data in Log Files
 */
public class ReorderDataInLogFiles {
	public String[] reorderLogFiles(String[] logs) {
        List<String> digits = new ArrayList<>();
        List<String> letters = new ArrayList<>();
        for (String log : logs) {
            char c = log.charAt(log.length() - 1);
            if (Character.isDigit(c)) {
                digits.add(log);
            } else {
                letters.add(log);
            }
        }
        letters.sort((l1, l2) -> {
            String[] split1 = l1.split(" ", 2);
            String[] split2 = l2.split(" ", 2);
            if (split1[1].equals(split2[1])) {
                return split1[0].compareTo(split2[0]);
            } else {
                return split1[1].compareTo(split2[1]);
            }
        });
        letters.addAll(digits);
        String[] arr = new String[letters.size()];
      
        return letters.toArray(arr);
    }
}
