package vn.com.ids.javacore.algorithm.leetcode.first50;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeetCode38 {
    private static final String ONE = "1";
    private static final Logger logger = LoggerFactory.getLogger(LeetCode38.class);

    public static void main(String[] args) {
        String result = countAndSay(10);
        logger.info("{}", result);
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return ONE;
        }
        String result = "";
        String previous = countAndSay(n - 1);
        int i = 0;
        int j = 0;
        while (i < previous.length()) {
            j = i;
            while (j < previous.length() && previous.charAt(i) == previous.charAt(j)) {
                j++;
            }
            result += j - i;
            result += previous.charAt(i);
            i = j;
        }

        return result;
    }

}
