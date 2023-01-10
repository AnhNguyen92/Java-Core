package javacore.algorithm.leetcode.under1800;

/*
 * LeetCode 1716. Calculate Money in LeetCode Bank
 */
public class CalculateMoneyInLeetCodeBank {
	public int totalMoney(int n) {
		int weeks = n / 7;
		int days = n % 7;
		int total = 0;
		for (int i = 1; i <= weeks; i++) {
			total += 21 + 7 * i;
		}

		for (int i = 0; i < days; i++) {
			total += ++weeks;
		}

		return total;
	}
	
	public int totalMoney1(int n) {
        int base = 0;
        int sum = 0;
        int[] days = {1,2,3,4,5,6,7};
        int day = 0;
        while (n > 0) {
            sum += days[day] + base;
            day = (day + 1 ) % 7;
            if (day == 0) 
                base++;
            n--;
        }
        return sum;
    }
	
}
