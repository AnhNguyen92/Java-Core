package javacore.algorithm.leetcode.under1400;

/**
 * 1362. Closest Divisors
 */
public class ClosestDivisors {
    public int[] closestDivisors(int num) {
        num++;
        int[] arr = new int[] {1, num};
        for (int i = (int) Math.sqrt(num); i >= 2; i--) {
            if (num % i == 0) {
                arr[0] = i;
                arr[1] = num / i;
                break;
            }
        }
        num++;
        int diff = Math.abs(arr[0] - arr[1]);
        for (int i = (int) Math.sqrt(num); i >= 2; i--) {
            if (num % i == 0 && Math.abs(num / i - i) < diff) {
                arr[0] = i;
                arr[1] = num / i;
                break;
            }
        }
        return arr;
    }
}
