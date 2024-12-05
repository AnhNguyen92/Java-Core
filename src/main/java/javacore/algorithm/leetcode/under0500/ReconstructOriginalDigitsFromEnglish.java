package javacore.algorithm.leetcode.under0500;

/*
 * LeetCode 423. Reconstruct Original Digits from English
 */
public class ReconstructOriginalDigitsFromEnglish {
    public String originalDigits(String s) {
        int[] arr = new int[10];
        int[] crr = new int[26];
        for (char c : s.toCharArray()) {
            crr[c - 'a']++;
        }
        // zero
        arr[0] = crr[25];
        crr[4] -= crr[25];
        crr[14] -= crr[25];
        crr[17] -= crr[25];

        // two
        arr[2] = crr[22];
        crr[14] -= crr[22];
        crr[19] -= crr[22];

        // six
        arr[6] = crr[23];
        crr[8] -= crr[23];
        crr[18] -= crr[23];
        // eight
        arr[8] = crr[6];
        crr[4] -= crr[6];
        crr[7] -= crr[6];
        crr[8] -= crr[6];
        crr[19] -= crr[6];
        // four
        arr[4] = crr[20];
        crr[5] -= crr[20];
        crr[14] -= crr[20];
        crr[17] -= crr[20];
        // three
        arr[3] = crr[17];
        crr[19] -= crr[17];
        crr[7] -= crr[17];
        crr[4] -= 2 * crr[17];

        // five
        arr[5] = crr[5];
        crr[8] -= crr[5];
        crr[21] -= crr[5];
        crr[4] -= crr[5];
        // one
        arr[1] = crr[14];
        crr[13] -= crr[14];
        crr[4] -= crr[14];

        // seven
        arr[7] = crr[18];
        crr[4] -= 2 * crr[18];
        crr[21] -= crr[18];
        crr[13] -= crr[18];

        // nine
        arr[9] = crr[8];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(String.valueOf(i).repeat(Math.max(0, arr[i])));
        }
        return sb.toString();
    }
}
