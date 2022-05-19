package javacore.algorithm.leetcode.under1400;

/*
 * Leetcode 1389
 */

public class CreateTargetArrayInTheGivenOrder {
	public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<index.length;i++) {
            if(index[i] < i){
                for(int j = i;j>index[i];j--){
                    ans[j] = ans[j-1];
                }
            }
            ans[index[i]] = nums[i];
        }
        return ans;
    }
	
	public int[] createTargetArray2(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = res.length - 1; j > index[i]; j--) {
                res[j] = res[j - 1];
            }
            res[index[i]] = nums[i];
        }
        return res;
    }
}
