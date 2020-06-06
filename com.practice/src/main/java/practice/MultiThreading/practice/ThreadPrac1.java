package practice.MultiThreading.practice;

public class ThreadPrac1 {
	public static void main(String[] args) {
		Runnable r =() ->{
			for(int i=0;i<4;i++)
				System.out.println(i+" ");
		};
		Thread t = new Thread(r);
		//t.start();
		t.run();
	}
}
