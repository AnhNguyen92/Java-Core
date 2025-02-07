package javacore.algorithm.leetcode.under3300;

/**
 * 3265. Count Almost Equal Pairs I
 */
public class CountAlmostEqualPairsI {
    public int countPairs(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] || canSwap(nums[i], nums[j]))
                    cnt++;
            }
        }
        return cnt;
    }

    public boolean canSwap(int a, int b) {
        int[] arr = new int[7];
        int i = 6;
        while (a > 0) {
            arr[i--] = a % 10;
            a /= 10;
        }

        for (i = 0; i < 6; i++) {
            int t1 = arr[i];
            for (int j = i + 1; j < 7; j++) {
                int t2 = arr[j];
                arr[i] = t2;
                arr[j] = t1;
                int x = 0;
                for (int k = 0; k < 7; k++)
                    x = x * 10 + arr[k];
                if (x == b)
                    return true;
                arr[j] = t2;
            }
            arr[i] = t1;
        }

        return false;
    }
}
