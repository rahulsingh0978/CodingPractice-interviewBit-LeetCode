package leetcode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sqrtFloor {
	public int sqrt(int x) {
		
	        if(x<=1){
	            return x;
	        }
	        int start = 1;
	        int end = x;
	        int ans=0;
	        while(start<=end){
	            int mid = (start+end)/2;
	            if(mid*mid==x){
	                ans=mid;
	                break;
	            }
	             if(mid*mid<x){
	                start = mid+1;
	                ans=mid;
	            }
	            else{
	                end=mid-1;
	            }
	        }
	        return ans;
		}
	
			
	    public static void main(String[] args) {
	    	sqrtFloor obj = new sqrtFloor();
	    	System.out.println(obj.sqrt(3));
	    	int [] a = new int[2];
	    	int f = a.length;
			
	    	
		}
}
