package javacore.algorithm.leetcode.under900;

/*
 * LeetCode 824
 */
public class GoatLatin {
	public String toGoatLatin(String s) {
        StringBuilder ans = new StringBuilder("");
        StringBuilder temp = new StringBuilder("");
        for (String str : s.split(" ")) {
            temp.append("a");
            char c = str.charAt(0);
            if (beginVowel(c)) {
                ans.append(str);
            } else {
                StringBuilder item = new StringBuilder(str);
                item.deleteCharAt(0);
                item.append(c);
                ans.append(item);
            }
            ans.append("ma").append(temp).append(" ");
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
    
    private boolean beginVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}
