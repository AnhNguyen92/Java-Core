package javacore.algorithm.leetcode.under3300;

import java.util.ArrayList;
import java.util.List;

/**
 * 3211. Generate Binary Strings Without Adjacent Zeros
 */
public class GenerateBinaryStringsWithoutAdjacentZeros {
    List<String> lst;

    public List<String> validStrings(int n) {
        lst = new ArrayList<>();
        recursion("0", 1, n);
        recursion("1", 1, n);

        return lst;
    }

    private void recursion(String s, int idx, int n) {
        if (idx == n) {
            lst.add(s);
            return;
        }
        if (s.endsWith("0")) {
            recursion(s + "1", idx + 1, n);
        } else {
            recursion(s + "0", idx + 1, n);
            recursion(s + "1", idx + 1, n);
        }
    }
}
