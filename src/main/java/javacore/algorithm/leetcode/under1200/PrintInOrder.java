package javacore.algorithm.leetcode.under1200;

import java.util.concurrent.CountDownLatch;

/*
 * LeetCode 1114. Print in Order
 */
public class PrintInOrder {
	class Foo {
		private CountDownLatch latch2 = new CountDownLatch(1);
		private CountDownLatch latch3 = new CountDownLatch(1);

		public Foo() {

		}

		public void first(Runnable printFirst) throws InterruptedException {
			// printFirst.run() outputs "first". Do not change or remove this line.
			printFirst.run();
			latch2.countDown();
		}

		public void second(Runnable printSecond) throws InterruptedException {
			latch2.await();
			// printSecond.run() outputs "second". Do not change or remove this line.
			printSecond.run();
			latch3.countDown();
		}

		public void third(Runnable printThird) throws InterruptedException {
			latch3.await();
			// printThird.run() outputs "third". Do not change or remove this line.
			printThird.run();
		}
	}
}
