package rahul_practice.com.practice;

public class MaxSubArraySum {

	// check the absurd behaviour in case of start not taken into consideration
	public static void maxSumSubarray(int[] a,int size) {
		int s =0,e=0,maxendcurrent=0,start=0;
		int maxsofar = -9999999;
		maxendcurrent = a[0];
		for(int i =1;i< size;i++) {
			maxendcurrent = Math.max(a[i],maxendcurrent+a[i]);
			
			
			if(maxsofar < maxendcurrent) {
				maxsofar = maxendcurrent;
				//start=s;
				//e=i;
			}
			
		}
		//System.out.println("max sum " +maxsofar+" start index "+s+" end index "+e);
		System.out.println(maxsofar);
	}
	public static void main(String[] args) {
		int[] a = {-20, -30, -19, -10, -22, -13, -500, -300};
		int n =  a.length;
		maxSumSubarray(a, n);
	}
}
