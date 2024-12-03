package javacore.algorithm.leetcode.under0700;

/**
 * 640. Solve the Equation
 */
public class SolveTheEquation {
    public String solveEquation(String equation) {
        int mid = equation.indexOf("=");
        String left = equation.substring(0, mid);
        String right = equation.substring(mid+1);
        int[] arr = processStr(left);
        int[] brr = processStr(right);
        int x = arr[0] - brr[0];
        int numb = brr[1] - arr[1];
        if (x == 0) {
            if (numb == 0)
                return "Infinite solutions";
            return "No solution";
        }
        return "x=" + (numb / x);
    }

    private int[] processStr(String s) {
        int[] arr = new int[2];
        int start = 0;
        char last = '\\';
        char curr;
        int sign = 1;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            curr = s.charAt(i);
            if (curr == 'x') {
                if (start < i) {
                    String elm = s.substring(start, i);
                    if ("-".equals(elm))
                        arr[0]--;
                    else
                        arr[0] += sign * Integer.parseInt(elm);
                } else {
                    arr[0] += sign;
                }
                start = i + 2;
            } else if (curr == '+' || curr == '-') {
                if (Character.isDigit(last)) {
                    arr[1] += sign * Integer.parseInt(s.substring(start, i));
                }
                start = i + 1;
                sign = (curr == '-') ? -1 : 1;
            } else if (i == n - 1) {
                arr[1] += sign * Integer.parseInt(s.substring(start, n));
            }
            last = curr;
        }
        return arr;
    }
}
