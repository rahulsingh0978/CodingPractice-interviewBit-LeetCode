package rahul_practice.com.mustdo;

public class SubarrayWIthSum {

	public static int subarraySum(int[] a , int sum) {
		int len = a.length;
		int start = 0, sum_so_far = a[0];
		for(int i =1;i<len;i++) {
			// if the max sum croses the sum so subtract and increment the start pointer
			while(sum_so_far>sum && start < i-1) {
				sum_so_far -= a[start];
				start++;
			}
			if(sum_so_far == sum) {
				int p = i-1;
				System.out.println(" the sum ffound start index "+start+" end index "+ p);
				return 1;
			}
			if(i<len){
				sum_so_far += a[i];
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int [] ar = { 1, 2, 3, 4, 5 ,6 ,7, 8, 9, 10};
		int i = subarraySum(ar,15);
	}
}
