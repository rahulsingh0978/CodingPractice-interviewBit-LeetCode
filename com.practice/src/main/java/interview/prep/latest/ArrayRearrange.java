package interview.prep.latest;

public class ArrayRearrange {
	public static int[] rearrange(int[] arr) {
		int n = arr.length;
		int min=0;
		int max = n-1;
		int maxElement = arr[n-1]+1;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				arr[i] += ( arr[max] % maxElement) *maxElement;
				max --;
			}else {
				arr[i] += (arr[min] % maxElement) *maxElement;
				min++;
			}
		}
		for(int i=0;i<n;i++) {
			arr[i]=arr[i]/maxElement;
		}
		return arr;
	}

	public static void main(String[] args) {
int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] val = rearrange(a);
		for ( int i : val) {
			System.out.print(i+" ");
		}
	}
}
