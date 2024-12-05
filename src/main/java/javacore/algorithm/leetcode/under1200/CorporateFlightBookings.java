package javacore.algorithm.leetcode.under1200;

/**
 * 1109. Corporate Flight Bookings
 */
public class CorporateFlightBookings {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for (int[] arr : bookings) {
            for (int i = arr[0]-1; i <= Math.min(arr[1]-1, n - 1);  i++) {
                ans[i] += arr[2];
            }
        }
        return ans;
    }
}
