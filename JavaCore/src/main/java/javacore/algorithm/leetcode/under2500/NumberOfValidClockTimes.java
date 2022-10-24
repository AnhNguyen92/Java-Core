package javacore.algorithm.leetcode.under2500;

/*
 * Leet code 2437
 */
public class NumberOfValidClockTimes {
	    public int countTime(String time) {
	        int four = (time.charAt(4) == '?') ? 10 : 1;
	        int three = (time.charAt(3) == '?') ? 6 : 1;
	        char cTwo = time.charAt(1);
	        char cOne = time.charAt(0);
	        int two = 1;
	        int one = 1;
	        if (cOne == '?' && cTwo == '?') {
	            two = 24;
	        } else if (cOne != '?' && cTwo == '?') {
	            if (cOne == '2') {
	                two = 4;
	            } else {
	                two = 10;
	            }
	        } else if (cOne == '?' && cTwo != '?') {
	            if (cTwo - '3' > 0) {
	                one = 2;
	            } else {
	                one = 3;
	            }
	        }
	        return one * two * three * four;
	    }
}
