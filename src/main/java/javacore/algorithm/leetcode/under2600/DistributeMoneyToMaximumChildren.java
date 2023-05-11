package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2591. Distribute Money to Maximum Children
 */
public class DistributeMoneyToMaximumChildren {
	public int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }
        if (money < 8 || money - children < 7) {
            return 0;
        }
        if (money == children * 8) {
            return children;
        }
        int balance;
        for (int i = children - 1; i >= 0; i--) {
            balance = money; 
            balance -= i * 8;
            if (balance < 0 || balance < children - i) {
                continue;
            }
            if (balance == children - i) {
                return i;
            }
            balance -= (children - i);
            if (balance == 3 && children - i == 1) {
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }
}
