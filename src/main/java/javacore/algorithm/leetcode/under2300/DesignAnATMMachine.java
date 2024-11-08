package javacore.algorithm.leetcode.under2300;

/**
 * 2241. Design an ATM Machine
 */
public class DesignAnATMMachine {
    class ATM {
        int[] arr;
        int[] invalid;

        public ATM() {
            arr = new int[5];
            invalid = new int[] { -1 };
        }

        public void deposit(int[] banknotesCount) {
            for (int i = 0;  i < 5; i++) {
                arr[i] += banknotesCount[i];
            }
        }

        public int[] withdraw(int amount) {
            int a = Math.min(amount / 500, arr[4]);
            amount -= a * 500;
            int b = Math.min(amount / 200, arr[3]);
            amount -= b * 200;
            int c = Math.min(amount / 100, arr[2]);
            amount -= c * 100;
            int d = Math.min(amount / 50, arr[1]);
            amount -= d * 50;
            int e = Math.min(amount / 20, arr[0]);
            amount -= e * 20;
            if (amount != 0) {
                return invalid;
            }
            arr[4] -= a;
            arr[3] -= b;
            arr[2] -= c;
            arr[1] -= d;
            arr[0] -= e;
            return new int[] { e, d, c, b, a };
        }
    }

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
}
