package javacore.algorithm.leetcode.under0100;

import java.util.HashMap;
import java.util.Map;

/**
 * 97. Interleaving String
 */
public class InterleavingString {
    Map<String, Integer> map = new HashMap<>();

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        if (isValid(s1, 0, s2, 0, s3, 0, true)) {
            return true;
        }
        map = new HashMap<>();
        return isValid(s2, 0, s1, 0, s3, 0, true);
    }

    private boolean isValid(String s1, int x, String s2, int y, String s3, int z, boolean isFirstStr) {
        if (isFirstStr) {
            if (map.get(x + "-" + y) != null) {
                return false;
            }
        } else {
            if (map.get(y + "-" + x) != null) {
                return false;
            }
        }
        if (s1.equals(s3)) {
            return true;
        }
        if (x >= s1.length()) {
            boolean valid = s2.substring(y).equals(s3.substring(z));
            if (!valid) {
                if (isFirstStr) {
                    map.put(x + "-" + y, 1);
                } else {
                    map.put(y + "-" + x, 1);
                }
            }
            return valid;
        }
        for (int i = x, j = z; i < s1.length() && j < s3.length(); i++, j++) {
            if (s1.charAt(i) == s3.charAt(j)) {
                if (isValid(s2, y, s1, i + 1, s3, j + 1, !isFirstStr)) {
                    return true;
                }
            } else {
                break;
            }
        }
        if (isFirstStr) {
            map.put(x + "-" + y, 1);
        } else {
            map.put(y + "-" + x, 1);
        }

        return false;
    }
}
