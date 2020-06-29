package Multithreading;

public class CountDownMain {
public static void main(String[] args) {
	CountDown cd = new CountDown();
	Runnable r1 = () ->{ 
		//without sync
	//cd.printCount();
		//with synch block
		synchronized (cd) {
			cd.printCount();
		}
	};
	Thread t1 = new Thread(r1,"one");
	Thread t2 = new Thread(r1,"two");
	t1.start();
	t2.start();
}
}
