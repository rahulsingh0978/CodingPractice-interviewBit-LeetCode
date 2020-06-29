package Multithreading;

public class Thread_01_03 {
	public static void main(String[] args) {
		System.out.printf("main thread info name:%s  alive:%s state:%n priority%d"+Thread.currentThread().getName(),Thread.currentThread().isAlive()
				,Thread.currentThread().getState(),Thread.currentThread().getPriority());
	}
}
