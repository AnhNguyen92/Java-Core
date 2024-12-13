package javacore.algorithm.leetcode.under3000;

/**
 * 2981. Find Longest Special Substring That Occurs Thrice I
 */
public class FindLongestSpecialSubstringThatOccursThriceI {
    public int maximumLength(String s) {
        int ans = -1;
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            StringBuilder sb = new StringBuilder();
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                sb.append(s.charAt(j));
                int count = countStr(s, sb.toString());
                if (count >= 3)
                    ans = Math.max(ans, sb.length());
                j++;
            }
        }
        return ans;
    }

    private int countStr(String source, String target) {
        int count = 0;
        int index = source.indexOf(target);
        while (index != -1) {
            count++;
            index = source.indexOf(target, index + 1);
        }
        return count;
    }
}
