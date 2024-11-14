package javacore.algorithm.leetcode.under0600;

/**
 * 592. Fraction Addition and Subtraction
 */
public class FractionAdditionAndSubtraction {
    public String fractionAddition(String expression) {
        boolean add = true;
        Fraction result = new Fraction(0, 1);
        int start = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if ((c == '-' && i > 0) || c == '+' || i == expression.length() - 1) {
                int end = i;
                if (i == expression.length() - 1)
                    end++;
                String s = expression.substring(start, end);
                String[] arr = s.split("/");
                Fraction second = new Fraction(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
                if (add) {
                    result.add(second);
                } else {
                    result.minus(second);
                }

                add = c == '+';
                start = i + 1;
            }
        }
        return result.toString();
    }

    public class Fraction {
        public int numerator;
        public int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public void add(Fraction other) {
            this.numerator = this.numerator * other.denominator + this.denominator * other.numerator;
            this.denominator *= other.denominator;
            this.minimize();
        }

        public void minus(Fraction other) {
            other.numerator *= -1;
            this.add(other);
            this.minimize();
        }

        private void minimize() {
            int gcd = findGCD(this.numerator, this.denominator);
            this.numerator /= gcd;
            this.denominator /= gcd;
            if (this.denominator < 0) {
                this.numerator *= -1;
                this.denominator *= -1;
            }
        }

        private int findGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public String toString() {
            return this.numerator + "/" + this.denominator;
        }
    }
}
