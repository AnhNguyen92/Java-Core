package javacore.algorithm.leetcode.under1300;

import java.util.HashMap;
import java.util.Map;

/**
 *
 1248. Count Number of Nice Subarrays
 */
public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int n = nums.length;
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                count++;
                map.put(count , i);
            }
        }
        if (map.size() < k) return 0;
        int ans = 0;
        for (int i = 1; i < map.size() - k + 1; i++) {
            int prev = map.get(i-1);
            int a = map.get(i);
            int b = map.get(i + k - 1);
            int next = ( map.get(i + k) != null) ? map.get(i + k) : n;
            ans += (a - prev) * (next-b);
        }
        return ans;
    }
}
