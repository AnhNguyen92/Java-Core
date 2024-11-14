package javacore.algorithm.leetcode.under0400;

import java.util.ArrayList;
import java.util.List;

/**
 * 386. Lexicographical Numbers
 */
public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>(n);
        int curr = 1;

        for (int i = 1; i <= n; i++) {
            ans.add(curr);
            if (curr * 10 <= n) {
                curr *= 10;
            } else if (curr % 10 != 9 && curr + 1 <= n) {
                curr++;
            } else {
                while ((curr / 10) % 10 == 9) {
                    curr /= 10;
                }
                curr = curr / 10 + 1;
            }
        }
        return ans;
    }
}
