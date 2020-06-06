package rahul_practice.com.practice;

public class leetReverse {
	public static int reverse(int x) {
        boolean negative = false;
        /*if(x < 0 ){
            negative = true;
            x *=-1;
        }*/
        int val = x;
        while(val%10==0) {
        	val/=10;
        }
        
        int n = 0;
        while(val>0) {
        	n =n*10+ val%10;
        	val = val/10;
        }
        /*if(negative) {
        	return -1*n;
        }*/
        return n;
    }
	
	public static long binary(long n){
        long sum=0;
        while(n/2>0){
            sum=sum*10+n%2;
            n=n/2;
        }
        return sum;
    }
	
	
	public static void decToBinary(long n) 
    { 
        
        long[] binaryNum = new long[1000]; 
   
        
        int i = 0; 
        while (n > 0)  
        { 
           
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
        long[] rev = new long[10000];
         
        int k=0;
        for (int j = i - 1; j >= 0; j--) { 
           rev[k]=binaryNum[j];
           
           k++;
        }
        
    } 
	
	public static int maxDiff (int arr[], int n) 
	{ 
	    // Initialize diff, current sum and max sum 
	    int diff = arr[1]-arr[0]; 
	    int curr_sum = diff; 
	    int max_sum = curr_sum; 
	  
	    for(int i=1; i<n-1; i++) 
	    { 
	        // Calculate current diff 
	        diff = arr[i+1]-arr[i]; 
	  
	        // Calculate current sum 
	        if (curr_sum > 0) 
	        curr_sum += diff; 
	        else
	        curr_sum = diff; 
	  
	        // Update max sum, if needed 
	        if (curr_sum > max_sum) 
	        max_sum = curr_sum; 
	    } 
	  
	    return max_sum; 
	} 
	
	public static void main(String[] args) {
		int t = 1534236469;
		//System.out.println(Math.pow(2, 32));
		//System.out.println(reverse(t))	;
		//System.out.println(21/10/10);
		//System.out.println(0^1);
		//System.out.println(1^1);
		decToBinary(8);
		//System.out.println(binary(8));
		int arr[] = {80, 2, 6, 3, 100};  
		int n = arr.length;  
		      
		// Function calling  
		System.out.print("Maximum difference is " +  
		                          maxDiff(arr, n));  
	}
	
}
