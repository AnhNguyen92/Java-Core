package javacore.algorithm.leetcode.under3200;

/**
 * 3106. Lexicographically Smallest String After Operations With Constraint
 */
public class LexicographicallySmallestStringAfterOperationsWithConstraint {
    public String getSmallestString(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == 'a' || k == 0)
                sb.append(c);
            else {
                int min = Math.min(c - 'a', 'z' - c + 1);
                if (min <= k) {
                    sb.append('a');
                    k -= min;
                } else {
                    char f = (char) ('a' + (c - 'a' + k) % 26);
                    char b = (char) ('a' + (c - 'a' - k + 26) % 26);
                    if (f - b >= 0)
                        sb.append(b);
                    else
                        sb.append(f);
                    k = 0;
                }
            }
        }
        return sb.toString();
    }
}
