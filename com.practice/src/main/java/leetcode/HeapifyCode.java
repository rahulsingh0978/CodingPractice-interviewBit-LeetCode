package leetcode;

import java.util.PriorityQueue;

public class HeapifyCode {

	private int k;
	private int[] num;

	public HeapifyCode(int k, int[] num) {
		this.k = k;
		this.num = num;
	}

	public int add(int val) {
		int n = num.length;
		int newArr[] = new int[n+1];
		for(int i=0;i<n;i++) {
			newArr[i]=num[i];
		}
		newArr[n]=val;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(newArr, n, i);
		}
		num=newArr;
		n=n+1;
		for (int j = n - 1; j > n-k; j--) {
			num[0] = num[0] + num[j];
			num[j] = num[0] - num[j];
			num[0] = num[0] - num[j];
			heapify(num, j, 0);
		}
		return num[0];
	}

	public void heapify(int[] nums , int n ,int i){
	        int largest=i;
	        int l=2*i+1;
	        int r = 2*i+2;
	        if(l<n && nums[largest]<nums[l]){
	            largest=l;
	        }
	        if(r<n && nums[largest]<nums[r]){
	            largest=r;
	        }  
	        if(largest!=i){
	            nums[i]=nums[largest]+nums[i];
				nums[largest]=nums[i]-nums[largest];
				nums[i]=nums[i]-nums[largest];
				heapify(nums,n,largest);
	        }
	    }
	
	
	  
  
    // Driver program 
    public static void main(String args[]) 
    { 
       
        
        int k = 3;
        int[] arr = {4,1};
       
      
        HeapifyCode ob = new HeapifyCode(3,arr); 
  
        System.out.println("kth value "+ob.add(3)); 
        System.out.println("kth value "+ob.add(5));
        System.out.println("kth value "+ob.add(10)); 
        System.out.println("kth value "+ob.add(9));  
        System.out.println("kth value "+ob.add(4));
       
        
    } 
}

