package javacore.algorithm.leetcode.under1500;

import java.util.HashMap;
import java.util.Map;

/**
 * 1487. Making File Names Unique
 */
public class MakingFileNamesUnique {
    public String[] getFolderNames(String[] names) {
        String[] arr = new String[names.length];
        Map<String, Integer> map = new HashMap<>();
        int x, n;
        for (int i = 0; i < names.length; i++) {
            String s = names[i];
            Integer val = map.get(s);
            if (val == null) {
                map.put(s, 1);
                arr[i] = s;
                n = s.length();
            } else {
                n = s.length();
                if (s.charAt(n - 1) == ')') {
                    x = 1;
                    while (map.get(s + "(" + x + ")") != null) {
                        x++;
                    }
                    map.put(s + "(" + x + ")", 1);
                    arr[i] = s + "(" + x + ")";
                } else {
                    while (map.get(s + "(" + val + ")") != null) {
                        val++;
                    }
                    arr[i] = s + "(" + val + ")";
                    map.put(s, val + 1);
                    map.put(arr[i], 1);
                }
            }
        }
        return arr;
    }
}
