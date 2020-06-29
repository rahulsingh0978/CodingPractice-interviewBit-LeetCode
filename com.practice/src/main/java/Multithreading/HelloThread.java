package Multithreading;

public class HelloThread extends Thread{

	public void run() {
		System.out.println("Using extends thread   : "+Thread.currentThread().getName());
	}
}
