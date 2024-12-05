package javacore.algorithm.leetcode.under2900;

/**
 * 2840. Check if Strings Can be Made Equal With Operations II
 */
public class CheckIfStringsCanBeMadeEqualWithOperationsII {
    public boolean checkStrings(String s1, String s2) {
        int[] even = new int[26];
        int[] odd = new int[26];
        for (int i = 0; i < s1.length(); i += 2) {
            even[s1.charAt(i) - 'a']++;
            even[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (even[i] != 0) {
                return false;
            }
        }
        for (int i = 1; i < s1.length(); i += 2) {
            odd[s1.charAt(i) - 'a']++;
            odd[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (odd[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
