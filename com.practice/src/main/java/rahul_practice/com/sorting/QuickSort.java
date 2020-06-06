package rahul_practice.com.sorting;

public class QuickSort {
	public static int partitionValue(int[] arr,int s,int e) {
		int n = arr.length;
		
		int pivot = arr[s];
		int i = s+1, j = e;
		while (i < j ) {
			while ( i< e && arr[i] < pivot ) {
				i++;
			} 
			while (arr[j] > pivot) {
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		int temp = arr[s];
		arr[s]=arr[j];
		arr[j]=temp;
		return j;
	}
	public static void quicksort(int[] arr,int s,int e) {
		/*if(e==s) {
			return;
		}*/if(s<e) {
		int pivot = partitionValue(arr ,s,e);
		
		quicksort(arr,s,pivot-1);
		quicksort(arr, pivot+1, e);}
		
		
	}
	public static void main(String[] args) {
		int[] arr = {40,32,1,32,2,43,11,20,2,6};
		quicksort(arr,0,9);
		//System.out.println(partitionValue(arr,0,9));
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}
}

// 10, 9 ,8 ,8, 5,23, 38