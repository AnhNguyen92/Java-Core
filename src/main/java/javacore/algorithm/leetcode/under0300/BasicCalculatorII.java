package javacore.algorithm.leetcode.under0300;

/*
 * 227. Basic Calculator II
 */
public class BasicCalculatorII {
	public static void main(String[] args) {
		int ans = new BasicCalculatorII().calculate("3+2*2");
		System.out.println(ans);
		ans = new BasicCalculatorII().calculate(" 3/2 ");
		System.out.println(ans);
		ans = new BasicCalculatorII().calculate(" 3+5 / 2 ");
		System.out.println(ans);
		ans = new BasicCalculatorII().calculate("1-1+1");
		System.out.println(ans);
		ans = new BasicCalculatorII().calculate("2-3+4");
		System.out.println(ans);
		ans = new BasicCalculatorII().calculate("-1-4");
		System.out.println(ans);
	}
	
	public int calculate(String s) {
		s = s.replace(" ", "");
		int i = 0;
		int j = 0;
		int a = 0;
		int b;
		while (s.indexOf("*") > 0 || s.indexOf("/") > 0) {
			int m = s.indexOf("*");
			int n = s.indexOf("/");
			a = 0;
			b = 0;
			int start;
			boolean multiple;
			if (m < 0) { // tinh theo n
				multiple = false;
				start = n;
			} else if (n < 0) { // tinh theo m
				start = m;
				multiple = true;
			} else { // tinh theo min(m, n)
				start = Math.min(m, n);
				multiple = m < n ? true : false;
			}
			i = start - 1;
			int count = 0;
	        while (i >= 0 && Character.isDigit(s.charAt(i))) {
	            a = (int) Math.pow(10, count++) * (s.charAt(i) - '0') + a;
	            i--;
	        }
	        if (i == 0 && s.charAt(0) == '-') {
                a *= -1;
            }
	        j = start + 1;
	        while (j < s.length() && Character.isDigit(s.charAt(j))) {
	            b = b * 10 + s.charAt(j) - '0';
	            j++;
	        }
	        
	        String s1 = i > 0 ? s.substring(0, i + 1) : "";
	        String s2 = j < s.length() ? s.substring(j) : "";
	        a = multiple ? (a * b) : (a / b);
	        s = s1 + a + s2;
	        return calculate(s);
		}
		a = 0;
		b = 0;
		if (s.indexOf("+") > 0 || s.indexOf("-", 1) > 0) {
			int m = s.indexOf("+");
			int n = s.indexOf("-", 1);
			a = 0;
			b = 0;
			int start;
			boolean plus;
			if (m < 0) { // tinh theo n
				plus = false;
				start = n;
			} else if (n <= 0) { // tinh theo m
				start = m;
				plus = true;
			} else { // tinh theo min(m, n)
				if (m < n) {
					start = m;
					plus = true;
				} else {
					start = n;
					plus = false;
				}
			}
			i = start - 1;
			int count = 0;
	        while (i >= 0 && Character.isDigit(s.charAt(i))) {
	            a = (int) Math.pow(10, count++) * (s.charAt(i) - '0') + a;
	            i--;
	        }
	        if (i == 0 && s.charAt(0) == '-') {
                a *= -1;
            }
	        j = start + 1;
	        while (j < s.length() && Character.isDigit(s.charAt(j))) {
	            b = b * 10 + s.charAt(j) - '0';
	            j++;
	        }
	        String s1 = j < s.length() ? s.substring(j) : "";
	        a = plus ? (a + b) : (a - b);
	        s = a + s1;
	        return calculate(s);
		}
		return Integer.valueOf(s);
	}

}
