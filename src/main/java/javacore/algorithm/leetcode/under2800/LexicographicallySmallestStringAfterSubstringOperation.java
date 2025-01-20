package javacore.algorithm.leetcode.under2800;

/**
 * 2734. Lexicographically Smallest String After Substring Operation
 */
public class LexicographicallySmallestStringAfterSubstringOperation {
    public String smallestString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int cont = 0;
        int idx = s.indexOf("a");
        if (idx < 0) {
            for (int i = 0; i < n; i++)
                sb.append((char) ('a' + (s.charAt(i) - 'a' - 1)));
        } else if (idx > 0) {
            for (int i = 0; i < idx; i++)
                sb.append((char) ('a' + (s.charAt(i) - 'a' - 1)));
            sb.append(s.substring(idx));
        } else {
            int i = 0;
            while (i < n && s.charAt(i) == 'a') {
                sb.append('a');
                i++;
            }
            if (i < n)  {
                for (; i < n; i++) {
                    if (s.charAt(i) == 'a')
                        break;
                    sb.append((char) ('a' + (s.charAt(i) - 'a' - 1)));
                }
            } else {
                sb.setCharAt(n-1, 'z');
                return sb.toString();
            }
            if (i < n)
                sb.append(s.substring(i));
        }
        return sb.toString();
    }
}
