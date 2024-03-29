package rahul_practice.com.practice;

import java.util.ArrayList;

public class MergeSort {
	public static int[] merge(int[] a, int[] b) {
		int i=0,j=0,k=0;
		int[] c = new int[a.length+b.length];
		while(i<a.length && j< b.length) {
			if(a[i]<b[j]) {
				c[k++]=a[i++];
			}
			else {
				c[k++]=b[j++];
			}
		}
		for(;i<a.length;i++) {
			c[k++]=a[i];
		}
		for(;j<b.length;j++) {
			c[k++]=b[j];
		}
		
		
		return c;

	}
	
	public static void mergeS(int[] a ,int lo , int mid , int hi) {
		int n1=mid-lo +1;
		int n2 = hi-mid;
		int[] a1 = new int[n1];
		int [] a2 = new int[n2];
		for(int i=0;i< n1 ; i++) {
			a1[i] = a[lo+i];
		}
		for(int j= 0;j<n2 ; j++) {
			a2[j]=a[mid+1+j];
		}
		
		int m=0,n=0,k=lo;
		while(m < n1 && n < n2) {
			if(a1[m]<a2[n]) {
				a[k++]=a1[m++];
			}
			else {
				a[k++]=a2[n++];
			}
		}
		while(m<n1){
			a[k++]=a1[m++];
		}
		while(n<n2) {
			a[k++]=a2[n++];
		}
	}
	public static void mergeSort(int[] a , int lo,int hi) {
		if(lo<hi) {
			int mid = (lo+hi)/2;
			mergeSort(a, lo, mid);
			mergeSort(a, mid+1, hi);
			mergeS(a,lo,mid,hi);
		}
		
	}
	
	public static int[] mergeTest(int[] a,int [] b,int m, int n) {
		int[] c = new int[m+n];
		int i=0,j=0,k=0;
		while(i<m && j<n) {
			if(a[i]<b[j]) {
				c[k++]=a[i++];
			}
			else {
				c[k++]=b[j++];
			}
		}
		if(i==m) {
			while(j<n) {
				c[k++]=b[j++];
			}
		}else {
			while(i<n) {
				c[k++]=a[i++];
			}
			
		}
		return c;
		
	}
	public static void main(String[] args) {
		/*int[] a = {1,5,9};
		int[] b = {8,10,11,12,13};
		int[] c = mergeTest(a,b,3,5);
		for(int i=0 ;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		
		System.out.println(0^1);*/
		ArrayList<Integer> result = new ArrayList<>();
		result.add(0);
		result.add(0);
		result.set(0, 4);
		result.set(1, 5);
		
		for( int i : result) {
			System.out.println(i);
		}
		
		/*int[] ar = {5,4,7,9,1};
		mergeSort(ar, 0, ar.length-1);
		for(int j =0;j<ar.length;j++) {
			System.out.println(ar[j]);
		}*/
		
	}
}
