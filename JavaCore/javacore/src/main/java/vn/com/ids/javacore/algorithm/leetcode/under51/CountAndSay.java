package vn.com.ids.javacore.algorithm.leetcode.under51;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * LeetCode 38
 */

public class CountAndSay {
    private static final String ONE = "1";
    private static final Logger logger = LoggerFactory.getLogger(CountAndSay.class);

    public static void main(String[] args) {
        String result = countAndSay(10);
        logger.info("{}", result);
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return ONE;
        }
        StringBuilder builder = new StringBuilder("");
        String previous = countAndSay(n - 1);
        int i = 0;
        int j = 0;
        while (i < previous.length()) {
            j = i;
            while (j < previous.length() && previous.charAt(i) == previous.charAt(j)) {
                j++;
            }

            builder.append(j - i);
            builder.append(previous.charAt(i));
            i = j;
        }

        return builder.toString();
    }

}
