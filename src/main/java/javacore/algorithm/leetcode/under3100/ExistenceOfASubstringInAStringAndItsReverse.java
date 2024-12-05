package javacore.algorithm.leetcode.under3100;

import java.util.HashSet;
import java.util.Set;

/**
 * 3083. Existence of a Substring in a String and Its Reverse
 */
public class ExistenceOfASubstringInAStringAndItsReverse {
        public boolean isSubstringPresent(String s) {
            Set<String> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                sb.insert(0, s.charAt(i));
                set.add(s.substring(i, i + 2));
            }
            sb.insert(0, s.charAt(s.length() - 1));
            String reverse = sb.toString();
            for (String str : set) {
                if (reverse.contains(str)) {
                    return true;
                }
            }
            return false;
        }
}
