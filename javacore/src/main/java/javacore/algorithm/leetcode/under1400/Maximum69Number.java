package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1323
 */
public class Maximum69Number {
	public int maximum69Number (int num) {
        String temp = Integer.toString(num);
        int[] nums = new int[temp.length()];
        boolean notFound = true;
        for (int i = 0; i < temp.length(); i++) {
            nums[i] = temp.charAt(i) - '0';
            if (notFound && nums[i] == 6) {
                notFound = false;
                nums[i] = 9;
            }
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result * 10 + nums[i];
        }
        return result;
    }
}
