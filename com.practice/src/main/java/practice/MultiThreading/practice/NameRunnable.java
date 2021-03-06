package practice.MultiThreading.practice;

public class NameRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("inside thread " + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		/*
		 * System.out.println(Thread.currentThread().getName()); NameRunnable nr =new
		 * NameRunnable(); Thread th = new Thread(nr); th.setName("Rahul"); th.start();
		 */
		(new HelloThread()).start();

		(new Thread(new HelloRunnable())).start();

		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println(" inside th thread runnable " + Thread.currentThread().getId());

			}

		};
		Runnable rn = () -> {
			System.out.println("inline ");
		};
		
		(new Thread(r)).start();
		(new Thread(rn)).start();
	}

}
