package javacore.algorithm.leetcode.under1600;

/*
 * LeetCode 1598
 */
public class CrawlerLogFolder {
	public int minOperations(String[] logs) {
        int x = 0;
        for (String log : logs) {
            if (log.equals("../")) {
              if (x > 0)
                    x--;
            } else if (!log.equals("./")) {
                x++;
            }
        }
        return x;
    }
}
