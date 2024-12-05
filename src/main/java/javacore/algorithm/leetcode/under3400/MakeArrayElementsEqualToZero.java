package javacore.algorithm.leetcode.under3400;

/**
 * 3354. Make Array Elements Equal to Zero
 */
public class MakeArrayElementsEqualToZero {
    public int countValidSelections(int[] nums) {
        int count = 0;
        int n = nums.length;
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = nums[i-1] + arr[i-1];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int diff = arr[n] - arr[i] * 2;
                if (diff == 0)
                    count += 2;
                else if (diff == 1 || diff == -1)
                    count += 1;
            }
        }
        return count;
    }
}
