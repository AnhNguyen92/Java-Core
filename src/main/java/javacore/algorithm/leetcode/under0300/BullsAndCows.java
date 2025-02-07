package javacore.algorithm.leetcode.under0300;

/**
 * 299. Bulls and Cows
 */
public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int a = 0;
        int[] arr = new int[10];
        int[] brr = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            arr[c1 - '0']++;
            brr[c2 - '0']++;
            if(c1 == c2)
                a++;
        }
        int b = 0;
        for (int i = 0; i <= 9; i++) {
            b += Math.min(arr[i], brr[i]);
        }
        return a + "A" + (b - a) + "B";
    }
}
