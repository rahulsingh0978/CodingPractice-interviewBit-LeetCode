package Multithreading;

public class HelloRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside the thread hello runnable "+Thread.currentThread().getName());
	}

}
