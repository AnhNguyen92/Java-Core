package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2129
 */
public class CapitalizeTheTitle {
	public String capitalizeTitle(String title) {
        String[] strParts = title.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : strParts) {
            str = str.toLowerCase();
            if (str.length() > 2) {
                sb.append(str.substring(0, 1).toUpperCase()).append(str.substring(1)).append(" ");
            } else {
                sb.append(str).append(" ");
            }
            
        }
        return sb.toString().trim();
    }
}
