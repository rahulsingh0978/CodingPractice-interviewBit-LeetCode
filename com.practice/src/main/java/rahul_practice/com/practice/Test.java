package rahul_practice.com.practice;

public class Test {
	public int maxSubArray(final int[] A) {
		int maxSoFar = A[0];
		int maxSum = 0;
		for (int i = 1; i < A.length; i++) {
			maxSoFar = (A[i] > (maxSoFar + A[i])) ? A[i] : (maxSoFar + A[i]);
			if (maxSoFar > maxSum) {
				maxSum = maxSoFar;
			}
		}
		return maxSum;
	}

	public int[] repeatedNumber(final int[] A) {
		int n= A.length;
		int sum=n*(n+1)/2;
		int sumSq= n*(n+1)*(2*n+1)/6;
		int asum=0;
		int asumSq=0;
		int a,b;
		for(int i=0;i<n;i++) {
			asum+=A[i];
			asumSq+=A[i]*A[i];
		}
		
		int c = sum-asum;
		int d = sumSq-asumSq;
		a= c+d /2;
		b = c - (( c+d)/2);
		
		
		
		
		return new int[]{1,2};
	}

	public static void main(String[] args) {
		Test obj = new Test();
		int[] ar = { -120, -202, -293, -60, -261, -67, 10, 82, -334, -393, -428, -182, -138 };
		int value = obj.maxSubArray(ar);
		// int val = Integer.MIN_VALUE;
		System.out.println(value);
	}
}
