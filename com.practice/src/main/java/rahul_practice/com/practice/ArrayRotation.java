package rahul_practice.com.practice;

public class ArrayRotation {
	static int gcd(int a,int b) {
		if( b==0) {
			return a;
		}
		else {
			return gcd( b, a%b);
		}
	}
	public static int[] array(int[] ar,int r) {
		int n =ar.length;
		int gcdVal = gcd(n,r);
		int j,k,temp;
		for(int i=0;i<gcdVal;i++) {
			temp = ar[i];
			j=i;
			while(true) {
				k=j+gcdVal;
				if(k>=n) {
					k=k-n;
				}
				if(k==i) {
					break;
				}
				ar[j]=ar[k];
				j=k;
			}
			ar[j]=temp;
		}
		
		
		return ar;
	}
	
	public static int gcd1(int a,int b) {
		if(b==0) {
			return a;
		}
		return gcd1(b,a%b);
	}
	
	public static int[] arrayRotation(int[] a,int d) {
		int n = a.length;
		int r = gcd(d,n);
		int temp=0,j,k;
		for(int i=0;i<r;i++) {
			temp = a[i];
			j=i;
			while(true) {
				k=j+r;
				if(k>=n) {
					k=k-n;
				}
				if(k==i) {
					break;
				}
				a[j]=a[k];
				j=k;
			}
			a[j]=temp;
			}
			return a;
			
		}
	
	public static void main(String[] args) {
		//System.out.println("gcd "+gcd1(10,25));
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] b = arrayRotation(a, 3);
		for(int i : b) {
			System.out.println(i);
		}
	}
}
