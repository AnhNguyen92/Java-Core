package vn.com.ids.javacore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Leetcode 1528
 */

public class ShuffleString {
    private static final Logger logger = LoggerFactory.getLogger(ShuffleString.class);

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = new int[] { 4, 5, 6, 7, 0, 2, 1, 3 };
        String shuffleStr = restoreString(s, indices);
        logger.info("{}", shuffleStr);
    }

    public static String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}
