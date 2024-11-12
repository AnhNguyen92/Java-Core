package javacore.algorithm.leetcode.under1500;

/**
 * 1405. Longest Happy String
 */
public class LongestHappyString {
    public String longestDiverseString(int a, int b, int c) {
        if (a > b && a >= c) {
                a = Math.min(a, (b+c+1) * 2);
                return buildStr(a, "aaa", "aa", "a", 'b', b, 'c', c);
            }
        if (b >= a && b >= c) {
            b = Math.min(b, (a+c+1) * 2);
            return buildStr(b, "bbb", "bb", "b", 'a', a, 'c', c);
        }
        c = Math.min(c, (a+b+1) * 2);
        return buildStr(c, "ccc", "cc", "c", 'b', b, 'a', a);
    }

    private String buildStr(int a, String triple, String dup, String single, char x, int i, char y, int j) {
        StringBuilder sb = new StringBuilder();
        sb.append(single.repeat(a + i + j));
        int k;
        while ((k = sb.indexOf(triple)) >= 0) {
            if (i >= j && i > 0) {
                sb.replace(k+2, k + 3, "" + x);
                i--;
            } else if (j > 0) {
                k = sb.indexOf(triple);
                sb.replace(k + 2, k + 3, "" + y);
                j--;
            }
        }
        while (i-- > 0) {
            k = sb.indexOf(dup);
            sb.replace(k + 1, k + 2, "" + x);
        }
        while (j-- > 0) {
            k = sb.indexOf(dup);
            sb.replace(k + 1, k + 2, "" + y);
        }
        while (i-- > 0) {
            k = sb.indexOf(single);
            sb.replace(k, k + 1, "" + x);
        }
        while (j-- > 0) {
            k = sb.indexOf(single);
            sb.replace(k, k + 1, "" + y);
        }
        return sb.toString();
    }
}
