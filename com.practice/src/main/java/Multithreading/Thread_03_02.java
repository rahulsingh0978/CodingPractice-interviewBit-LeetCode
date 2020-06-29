package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_03_02 {
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++) {
			Runnable r1 = new WorkerThread("I am thread "+i);
			ex.execute(r1);
		}
		ex.shutdown();
		while(!ex.isTerminated()) {}
		System.out.println("THread shutdown!!");
	}
}
