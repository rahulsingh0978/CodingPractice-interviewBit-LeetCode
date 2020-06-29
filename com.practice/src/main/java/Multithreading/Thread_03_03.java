package Multithreading;

import java.util.concurrent.CountDownLatch;

public class Thread_03_03 {
public static void main(String[] args) {
	CountDownLatch start = new CountDownLatch(1);
	CountDownLatch end = new CountDownLatch(1);
	
	for(int i=0;i<5;i++) {
		new Thread(new Worker(start, end)).start();
	}
	
	try {
		System.out.println(" main thread doing something");
		Thread.sleep(1000);
		start.countDown();
		System.out.println(" main doin something else ");
		end.await();
	}catch(InterruptedException e) {
		System.err.println(e);
	}
}
}
