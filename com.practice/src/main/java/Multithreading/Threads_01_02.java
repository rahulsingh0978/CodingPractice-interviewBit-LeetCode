package Multithreading;

public class Threads_01_02 {
	public static void main(String[] args) {
		(new Thread(new HelloRunnable())).start();
		
		(new HelloThread()).run();
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("This is non lambda way of creating the thread "+Thread.currentThread().getName());
			}
		};
		
		Runnable r2 = () -> System.out.println(" Using lambda creation a thread "+Thread.currentThread().getName());
		
		
		Thread t1 = new Thread(r1," -> using runnable in class ");
		Thread t2 = new Thread(r2," -> using runnable in class but with lambda  ");
		
		t1.start();
		t2.start();
	}
}
