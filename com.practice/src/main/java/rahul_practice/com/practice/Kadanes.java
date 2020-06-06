package rahul_practice.com.practice;

public class Kadanes {
	 
	public static void maxArrayWithIndices(int[] ar,int size) {
		int s=0,e=0,start=0;
		int maxSoFar=Integer.MIN_VALUE;
		int maxEndHere = 0;
		for(int i=0;i<size;i++) {
			maxEndHere +=ar[i];
			if(maxEndHere > maxSoFar) {
				maxSoFar =maxEndHere;
				e = i;
				start=s;
				
			}
			if(maxEndHere<0) {
				maxEndHere=0;
				s=i+1;
			}
		}
		System.out.println("start "+start+" end "+e+" sum "+maxSoFar);
		
	}
    static int maxSubArraySum(int a[], int size) 
    { 
    int max_so_far = a[0]; 
    int curr_max = a[0]; 
  
    for (int i = 1; i < size; i++) 
    { 
           curr_max = Math.max(a[i], curr_max+a[i]); 
        max_so_far = Math.max(max_so_far, curr_max); 
    } 
    return max_so_far; 
    } 
  
    /* Driver program to test maxSubArraySum */
    public static void main(String[] args) 
    { 
    int a[] = {-2}; 
    int n = a.length;
    maxArrayWithIndices(a, n);
    int max_sum = 0;//maxSubArraySum(a, n); 
    System.out.println("Maximum contiguous sum is " 
                       + max_sum); 
    System.out.println(0^2);
    } 
}
