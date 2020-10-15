package vn.com.ids.javacore.algorithm.leetcode.first50;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeetCode13 {
	private static Logger logger = LoggerFactory.getLogger(LeetCode13.class);
	public static void main(String[] args) {
		String s = "III";
		logger.info("{}", romanToInt(s));
	}
	
	public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
			sum += charToInt(s.charAt(i));
            if (i > 0) {
                if ((s.charAt(i - 1) == 'I') && ((s.charAt(i) == 'V') || (s.charAt(i) == 'X'))) {
                    sum -= 2;
                }
                if ((s.charAt(i - 1) == 'X') && ((s.charAt(i) == 'L') || (s.charAt(i) == 'C'))) {
                    sum -= 20;
                }
                if ((s.charAt(i - 1) == 'C') && ((s.charAt(i) == 'D') || (s.charAt(i) == 'M'))) {
                    sum -= 200;
                }
            }
		}
    
        return sum;
    }
    
    private static int charToInt(char c) {
        int result = 0;
        switch (c) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
        }
        
        return result;
    }
	
}
