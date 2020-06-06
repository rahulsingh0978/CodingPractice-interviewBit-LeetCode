package rahul_practice.com.practice;

public class Fatorial {
	public static int factorialIter(int n) {
		int fact = 1;
		for (int i = n; i > 0; i--) {
			fact *= i;
		}
		return fact;
	}
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}else {
			int facto = n * fact(n-1);
			return facto;
		}
	}

	public static void main(String[] args) {
		System.out.println(factorialIter(4));
		System.out.println(fact(4));
	}
}
