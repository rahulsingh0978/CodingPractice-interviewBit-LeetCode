package Multithreading;

public class CountDown {
public void printCount() {
	try {
		for(int i=10;i>0;i--) {
			System.out.println(" ---- "+i);
		}
		System.out.println("counddown end!! ");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
