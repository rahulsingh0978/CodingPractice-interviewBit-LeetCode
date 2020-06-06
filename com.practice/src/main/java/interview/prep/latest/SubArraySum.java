package interview.prep.latest;

public class SubArraySum {

	public static int subArray(int[] arr , int sum) {
		int start = 0;
		int total = 0;
		int n=arr.length;
		total = arr[0];
		for(int i=1;i<=n;i++) {
			while(total > sum && start < i-1) {
				total -=arr[start];
				start++;
			}
			if(total==sum) {
				int p = i-1;
				System.out.println("Start index is :"+start+" end index is"+p);
				return 1;
			}
			if(i<n) {
				total +=arr[i];
			}
		}
		System.out.println("No element found");
		return -1;
		
	}
	public static void main(String[] args) {

		int[] ar = {1, 4};
		int sum = 0;
		subArray(ar,sum);
			//
		
		
	}
}
