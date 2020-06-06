package rahul_practice.com.dp;

public class Fibonacci {
	public static int fib(int n) { //memoization
		if(n <=1) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);

	}
	
	public static int fibTabular(int n) {
		int []f= new int[n+1];
		f[0]=0;
		f[1]=1;
		if(n<=1) {
			return n;
		}
		for(int i=2;i<=n;i++) {
			f[i]= f[i-1]+f[i-2];
		}
		return f[n];
		
	}
	public static void main(String[] args) { //tabulation
		System.out.println(fib(5));
		System.out.println(fibTabular(5));
	}
}
