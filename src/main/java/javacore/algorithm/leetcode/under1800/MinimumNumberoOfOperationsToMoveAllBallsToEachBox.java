package javacore.algorithm.leetcode.under1800;

/*
 * LeetCode 1769. Minimum Number of Operations to Move All Balls to Each Box
 */
public class MinimumNumberoOfOperationsToMoveAllBallsToEachBox {
	public int[] minOperations(String boxes) {
        int n = boxes.length();

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        int count = boxes.charAt(0) - '0';
        for(int i = 1 ; i < n ; i++){
            left[i] = left[i - 1] + count;
            count += boxes.charAt(i) - '0';
        }

        count = boxes.charAt(n - 1) - '0';
        for(int i = n - 2 ; i >=0 ; i--){
            right[i] = right[i + 1] + count;
            count += boxes.charAt(i) - '0';
        }
		
        for(int i = 0 ; i < n ; i++) {
            ans[i] = left[i] + right[i];
        }

        return ans;
    }
	
	public int[] minOperations2(String boxes) {
        int[] res = new int[boxes.length()];
        int[] arr = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            char c = boxes.charAt(i);
            arr[i] = Character.getNumericValue(c);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == 1)
                    res[i] += i - j;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == 1)
                    res[i] += j - i;
            }
        }
        return res;
    }
}
