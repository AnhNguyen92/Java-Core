package javacore.algorithm.leetcode.under1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 932. Beautiful Array
 */
public class BeautifulArray {
    public int[] beautifulArray(int n) {
        List<String> lst = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            lst.add(reverse(convert(i)));
        }
        Collections.sort(lst);
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = Integer.parseInt(reverse(lst.get(i)), 2);
        }
        return ans;
    }

    private String convert(int number) {
        return Integer.toBinaryString(number);
    }

    private String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
