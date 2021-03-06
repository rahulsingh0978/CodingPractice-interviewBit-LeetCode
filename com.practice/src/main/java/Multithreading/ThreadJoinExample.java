package Multithreading;

public class ThreadJoinExample {
public static void main(String[] args) {
	ThreadJoinClass t1 = new ThreadJoinClass("First ");
	ThreadJoinClass t2 = new ThreadJoinClass("Second ");
	ThreadJoinClass t3 = new ThreadJoinClass("Third ");
	
	t1.start();
	t2.start();
	try {
		t1.join(); // any thread start which is called after join will start executing after this
	}catch(Exception e) {
		System.out.println(e);
	}
	
	t3.start();
	
}
}
