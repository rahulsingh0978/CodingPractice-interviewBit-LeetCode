package rahul_practice.com.practice;

import java.util.HashMap;

public class SubArraySum {

static int subaraySum(int arr[] , int sum) {
	int s=0,e=0;
	int curr = arr[0];
	int eqsum = 0;
	int n = arr.length;
	/*for(int i=1;i<=n;) {
		//curr+=arr[i];
		if(curr > sum) {
			curr -=arr[s];
			s+=1;
		}
		else if(curr==sum) {
			e=i-1;
			System.out.println("start index "+s+ " end index "+e);
			break;
		}
		else if(i<n) {
			curr +=arr[i];
			i++;
		}
	}*/
	
	for(int i=1;i<=n;i++) {
		while(curr>sum && s<i-1) {
			curr = curr -arr[s];
			s++;
		}
		
		if(sum == curr) {
			e=i-1;
			System.out.println("start index is "+s+" end index is "+e);
			return 1;
		}
		if(i<n) {
			curr = curr+arr[i];
		}
	}
	return -1;
	
}

static int checkSubArraySum(int arr[] , int sum) {
	int s=0,e=-1;
	int curr=0;
	int n = arr.length;
	HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
	for(int i=0;i<n ;i++) {
		curr = curr+arr[i];
		
		if(curr-sum==0) {
			s=0;e=i;
			break;
		}
		if(map.containsKey(curr-sum)) {
			s= map.get(curr-sum) +1;
			e = i;
			break;
		}
		map.put(curr, i);
	}
	return -1;
}
public static void main(String[] args) {
	int[] arr = {1, 4 , -3 ,10,6};
	int val=checkSubArraySum(arr, 7);
	System.out.println(val);
}
}
