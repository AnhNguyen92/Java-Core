package javacore.algorithm.leetcode.under3400;

/*
 * 3334. Find the Maximum Factor Score of Array
 */
public class FindTheMaximumFactorScoreOfArray {
    public long maxScore(int[] nums) {

        int n = nums.length;
        if (n == 1) {
            return (long) nums[0] * nums[0];
        }
        long lcm = lcmOfArray(nums);
        int gcd = gcdOfArray(nums);
        long product = lcm * gcd;
        int[] arr = new int[n - 1];
        System.arraycopy(nums, 0, arr, 0, n - 1);
        product = Math.max(product, lcmOfArray(arr) * gcdOfArray(arr));
        int prev = nums[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = prev;
            product = Math.max(product, lcmOfArray(arr) * gcdOfArray(arr));
            prev = nums[i];
        }
        return product;
    }

    public long lcm(long a, long b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long lcmOfArray(int[] arr) {
        long result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int gcdOfArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }

}
