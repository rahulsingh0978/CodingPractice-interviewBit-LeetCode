package Multithreading;

import java.util.concurrent.CountDownLatch;

import javax.print.attribute.standard.PrinterInfo;

public class Worker extends Thread{
	private final CountDownLatch start;
	private final CountDownLatch end;
	
	public Worker(CountDownLatch start,CountDownLatch end) {
		this.start=start;
		this.end=end;
	}
	public void run() {
		try {
			printInfo("thread entered run");
			start.await();
			printInfo("doing work");
			end.countDown();
		}catch(InterruptedException e) {
			System.err.println(e);
		}
	}
	public void printInfo(String s) {
		System.out.println(" doing work "+s+" ");
	}

}
