package Multithreading;

public class ThreadJoinClass extends Thread {
	public ThreadJoinClass(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception ex) {
				System.out.println(ex);
			}
			System.out.println(" name of the theread is  "+Thread.currentThread().getName()+" i: "+i);
		}
	}
}
