package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.List;

/**
 * 816. Ambiguous Coordinates
 */
public class AmbiguousCoordinates {
    public List<String> ambiguousCoordinates(String s) {
        List<String> lst = new ArrayList<>();
        int n = s.length();
        for (int i = 2; i <= n - 2; i++) {
            String s1 = s.substring(1, i);
            if (validPart(s1)) {
                String s2 = s.substring(i, n - 1);
                if (validPart(s2)) {
                    List<String> left = genStr(s1);
                    List<String> right = genStr(s2);
                    for (String l : left) {
                        for (String r : right) {
                            lst.add("(" + l + ", " + r + ")");
                        }
                    }
                }
            }
        }
        return lst;
    }

    private List<String> genStr(String s) {
        List<String> lst = new ArrayList<>();
        if (s.length() == 1 || s.charAt(s.length() - 1) == '0') {
            lst.add(s);
        } else if (s.charAt(0) == '0') {
            lst.add(s.charAt(0) + "." + s.substring(1));
        } else {

            for (int i = 1; i <= s.length() - 1; i++) {
                lst.add(s.substring(0, i) + "." + s.substring(i));
            }
            lst.add(s);
        }
        return lst;
    }

    private boolean validPart(String s) {
        if (s.length() == 1 || s.charAt(0) != '0')
            return true;
        return s.charAt(s.length() - 1) != '0';
    }
}
