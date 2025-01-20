package javacore.algorithm.leetcode.under2700;

/**
 * 2645. Minimum Additions to Make Valid String
 */
public class MinimumAdditionsToMakeValidString {
    public int addMinimum(String word) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        for (char c : word.toCharArray()) {
            if (c == 'a') {
                ans += count(sb);
                sb = new StringBuilder("a");
            } else if (c == 'b') {
                if (!sb.isEmpty() && sb.charAt(sb.length() - 1) != 'a') {
                    ans += count(sb);
                    sb = new StringBuilder();
                }
                sb.append(c);
            } else {
                if (!sb.isEmpty()) {
                    if (sb.charAt(sb.length() - 1) == 'c') {
                        ans += 2;
                    } else {
                        sb.append(c);
                    }
                    ans += count(sb);
                    sb = new StringBuilder();
                } else {
                    ans += 2;
                }
            }
        }
        ans += count(sb);
        return ans;
    }

    private int count(StringBuilder sb) {
        int n = sb.length();
        if (n == 1)
            return 2;
        if (n == 2) {
            return 1;
        }
        return 0;
    }
}
