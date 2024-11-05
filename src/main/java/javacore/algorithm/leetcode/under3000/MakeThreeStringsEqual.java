package javacore.algorithm.leetcode.under3000;

/**
 * 2937. Make Three Strings Equal
 */
public class MakeThreeStringsEqual {
    public int findMinimumOperations(String s1, String s2, String s3) {
        if (s1.charAt(0) != s2.charAt(0) || s1.charAt(0) != s3.charAt(0) || s3.charAt(0) != s2.charAt(0))
            return -1;
        int count = 0;
        char x, y, z;
        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();
        for (int i = 0; i < Math.min(n1, Math.min(n2, n3)); i++) {
            x = s1.charAt(i);
            y = s2.charAt(i);
            z = s3.charAt(i);
            if (x == y && x == z)
                count++;
            else break;
        }

        return n1 + n2 + n3 - 3 * count;
    }
}
