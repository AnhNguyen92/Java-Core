package javacore.algorithm.leetcode.under1400;

/**
 * 1358. Number of Substrings Containing All Three Characters
 */
public class NumberOfSubstringsContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int l = 0, r = -1, a = 0, b = 0, c = 0, ans = 0, n = s.length();
        while (r <= n - 1 && l <= n - 3) {
            while (r < n - 1 && (a == 0 || b == 0 || c == 0)) {
                r++;
                if (s.charAt(r) == 'a') a++;
                else if (s.charAt(r) == 'b') b++;
                else c++;
            }
            if (a >= 1 && b >= 1 && c >= 1) {
                ans += n - r;
            }
            if (l <= n - 3) {
                if (s.charAt(l) == 'a') a--;
                else if (s.charAt(l) == 'b') b--;
                else c--;
                l++;
            }
        }
        return ans;
    }
}
