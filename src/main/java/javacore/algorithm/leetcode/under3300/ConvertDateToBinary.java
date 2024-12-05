package javacore.algorithm.leetcode.under3300;

/*
 * 3280. Convert Date to Binary
 * */
public class ConvertDateToBinary {
    public String convertDateToBinary(String date) {
        int x = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : date.toCharArray()) {
            if (c == '-') {
                sb.append(Integer.toBinaryString(x));
                sb.append("-");
                x = 0;
            } else {
                x = x * 10 + (c - '0');
            }
        }
        sb.append(Integer.toBinaryString(x));

        return sb.toString();
    }
}
