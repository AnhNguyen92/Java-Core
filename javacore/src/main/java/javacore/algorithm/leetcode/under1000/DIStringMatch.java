package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 942. DI String Match
 */
public class DIStringMatch {
	public int[] diStringMatch(String s) {
        int n = s.length();
        int lo = 0;
        int hi = n;
        int[] ans = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[n] = lo;
        return ans;
    }
	
	public int[] diStringMatch1(String s) {
        int [] ans = new int[s.length() + 1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = i;
        }
        int count = 0;
        while (count < s.length()) {
            if (s.charAt(count) == 'I' && ans[count] < ans[count+1]) {
                count++;
            } else if (s.charAt(count) == 'D' && ans[count] > ans[count+1]) {
                count++;
            } else {
                int temp = ans[count];
                ans[count] = ans[count+1];
                ans[count+1] = temp;
                count = 0;
            }
        }
        
        return ans;
    }
}
