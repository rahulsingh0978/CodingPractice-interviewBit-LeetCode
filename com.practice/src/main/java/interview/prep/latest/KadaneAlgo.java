package interview.prep.latest;

public class KadaneAlgo {
	static void maxSubArraySum(int a[], int size) 
    { 
        int max_so_far = Integer.MIN_VALUE, 
        max_ending_here = 0,start = 0, 
        end = 0, s = 0; 
  
        for (int i = 0; i < size; i++)  
        { 
            int t = max_ending_here + a[i]; 
  
            if (max_so_far < max_ending_here)  
            { 
                max_so_far = max_ending_here; 
                start = s; 
                end = i; 
            } 
  
            if (max_ending_here < 0)  
            { 
                max_ending_here = 0; 
                s = i + 1; 
            } 
        } 
        System.out.println("Maximum contiguous sum is " 
                           + max_so_far); 
        System.out.println("Starting index " + start); 
        System.out.println("Ending index " + end); 
    } 
	public static void maxSumSubwithIndexNegative(int[] arr) {
		int len = arr.length;
		int start=0,s=0,e=0;
		int mxsofar=Integer.MIN_VALUE;
		int mxendhere = 0;
		for(int i=0;i<len;i++) {
			mxendhere += arr[i];
			if(mxendhere > mxsofar) {
				mxsofar=mxendhere;
				start = s;
				e=i;
			}
			if(mxendhere<0) {
				mxendhere=0;
				s=i+1;
			}
		}
		System.out.println("Max value is "+mxsofar+" "+start+" "+e);
	}
	public static void main(String[] args) {
		int[] arr = {-2, -3, 2, -1, 2, -1, -2, -3};
		//int r = maxSumSub1(arr);
		//System.out.println("Print value :"+r);
		
		
		//System.out.println(Integer.MIN_VALUE+(-2));
		
		
		int a[] = { -1,-2 }; 
        //int n = a.length; 
        maxSumSubwithIndexNegative(a); 
	}
}
