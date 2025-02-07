package javacore.algorithm.leetcode.under2600;

/**
 * 2531. Make Number of Distinct Characters Equal
 */
public class MakeNumberOfDistinctCharactersEqual {
    public boolean isItPossible(String word1, String word2) {
        int[][] arr = new int[2][26];
        for (char c : word1.toCharArray())
            arr[0][c - 'a']++;
        for (char c : word2.toCharArray())
            arr[1][c - 'a']++;
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[0][i] > 0) cnt1++;
            if (arr[1][i] > 0) cnt2++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[0][i] == 0)
                continue;
            for (int j = 0; j < 26; j++) {
                if (arr[1][j] == 0)
                    continue;
                if (i == j)
                    if (cnt1 == cnt2)
                        return true;
                    else
                        continue;
                int a = (arr[0][i] > 1) ? cnt1 : (cnt1 - 1);
                int b = (arr[1][j] > 1) ? cnt2 : (cnt2 - 1);
                if (arr[1][i] == 0)
                    b++;
                if (arr[0][j] == 0)
                    a++;
                if (a == b)
                    return true;
            }
        }
        return false;
    }
}
