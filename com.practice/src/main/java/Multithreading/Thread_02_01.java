package Multithreading;
/**
 * Example of race condition when 2 thread make change to shared global variable
 * @author rahul.singh
 *
 */
public class Thread_02_01 {
	static double a = 10;
	static double b;

	public static void main(String[] args) {
		Runnable r1 = () ->
		{
		if(a==10) {
			try{
				
			Thread.sleep(0);
			b=a/2.0;
			System.out.println("name of the thread is : "+Thread.currentThread().getName()+" value of b is "+b);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		};
		
		Runnable r2 = new Runnable() {
			
			
			@Override
			public void run() {
				a=12.0;
				
			}
		};
		
		Thread t1 = new Thread(r1,"First ");
		Thread t2 = new Thread(r2,"Second ");
		
		t1.start();
		t2.start();
	}
}
