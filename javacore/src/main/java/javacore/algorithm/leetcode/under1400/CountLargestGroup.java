package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1399
 */
public class CountLargestGroup {
	public int countLargestGroup(int n) {
        int[] arr = new int[n+1];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int sum = sumDigit(i);
            arr[sum]++;
            if (arr[sum] > max) {
                max = arr[sum];
            }
        }
        
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (arr[i] == max) {
                count++;
            }
        }
        return count;    
    }
    
    private int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
