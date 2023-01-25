package javacore.algorithm.leetcode.under1400;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1324. Print Words Vertically
 */
public class PrintWordsVertically {
	public List<String> printVertically(String s) {
        List<String> lst = new ArrayList<>();
        String[] arr = s.split(" ");
        StringBuilder sb;
        int max = 0;
        for (String str : arr) {
            max = Math.max(max, str.length());
        }
        for (int i = 0; i < max; i++) {
            sb = new StringBuilder();
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[j].length() <= i) {
                    if (sb.length() > 0) {
                        sb.insert(0 ," ");
                    }
                } else {
                    sb.insert(0, arr[j].charAt(i));
                }
            }
            lst.add(sb.toString());
        }
        return lst;
    }
}
