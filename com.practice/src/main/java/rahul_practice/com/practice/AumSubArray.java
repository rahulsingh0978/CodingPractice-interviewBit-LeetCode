package rahul_practice.com.practice;



/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class AumSubArray {
    public static int sumsubArraySum(int[] a,int n,int sum) {
    	int sumSoFar = a[0],i,s=0;
    	for(i=1;i<=n;i++) {
    		while(sumSoFar>sum && s<i-1) {
    			sumSoFar -=a[s];
    			s++;
    		}
    		if(sumSoFar==sum) {
    			int e = i-1;
    			System.out.println(s+" "+e);
    			return 1;
    		}
    		if(i<n) {
    			sumSoFar+=a[i];
    		}
    	}
    	System.out.println("not found");
    	return -1;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sumsubArraySum(arr,n,sum);
	}
}