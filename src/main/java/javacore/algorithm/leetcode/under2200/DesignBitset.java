package javacore.algorithm.leetcode.under2200;

/**
 * 2166. Design Bitset
 */
public class DesignBitset {
    class Bitset {
        boolean[] arr;
        int len;
        int count;
        boolean noFlip = true;
        public Bitset(int size) {
            arr = new boolean[size];
            len = size;
            count = 0;
        }

        public void fix(int idx) {
            if ( (noFlip && !arr[idx]) || (!noFlip && arr[idx]) ) {
                count++;
                arr[idx] = !arr[idx];
            }
        }

        public void unfix(int idx) {
            if ( (noFlip && arr[idx]) || (!noFlip && !arr[idx]) ) {
                count--;
                arr[idx] = !arr[idx];
            }
        }

        public void flip() {
            noFlip = !noFlip;
            count = len - count;
        }

        public boolean all() {
            return count == len;
        }

        public boolean one() {
            return count != 0;
        }

        public int count() {
            return count;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (noFlip) {
                for (boolean b : arr) {
                    sb.append(b ? '1' : '0');
                }
            } else {
                for (boolean b : arr) {
                    sb.append(b ? '0' : '1');
                }
            }
            return sb.toString();
        }
    }

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */
}
