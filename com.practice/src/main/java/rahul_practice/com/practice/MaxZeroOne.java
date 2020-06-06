package rahul_practice.com.practice;

import java.util.HashMap;

public class MaxZeroOne {
static void zeroone(int arr[]) {
	int s=-1;
	int maxCount=0;
	int sum=0;
	int n=arr.length;
	HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
	for(int i=0;i<n;i++) {
		arr[i]= arr[i]==0?-1:1;
	}
	for(int i=0;i<n;i++) {
		sum = sum+arr[i];
		if(sum==0) {
			maxCount=i+1;
			s	=i;
		}
		if(map.containsKey(sum+n)) {
			if(maxCount < i-map.get(sum+n)) {
				maxCount = i-map.get(sum+n);
				s=i;
			}
		}
		else {
			map.put(sum+n, i);
		}
	}
	int e = s - maxCount  +1;
	System.out.println(" start "+e+" end "+s);
}

public static void main(String[] args) {
	int []a = { 1,1, 1, 1};
	zeroone(a);
}
}
