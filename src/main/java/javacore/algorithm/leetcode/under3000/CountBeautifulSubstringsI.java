package javacore.algorithm.leetcode.under3000;

/**
 * 2947. Count Beautiful Substrings I
 */
public class CountBeautifulSubstringsI {
    public int beautifulSubstrings(String s, int k) {
        int ans = 0;
        int n = s.length();
        int[] vowels = new int[n+1];
        int[] consonants = new int[n+1];
        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i-1);
            switch(c) {
                case 'a', 'e', 'i', 'o', 'u' -> vowels[i]++;
                default -> consonants[i]++;
            }
            vowels[i] += vowels[i-1];
            consonants[i] += consonants[i-1];
        }
        int a, b;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i+1; j <= n; j++) {
                a = vowels[j] - vowels[i];
                b= consonants[j] - consonants[i];
                if (a == b && a * a % k == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
