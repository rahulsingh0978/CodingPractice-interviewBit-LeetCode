package rahul_practice.com.dp;

public class LengthLongestIncreasingSub {
	public int longestCommonSubsequence(int arr[]) {
		int[] T = new int[arr.length];
		int solutionArr[] = new int[arr.length];
		int maxIndex = 0;
		int n = arr.length;
		for(int i =0;i<n;i++) {
			T[i]=1;
			solutionArr[i]=i;
		}
		
		for(int i =1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					if(T[j]+1 >T[i] ) {
						T[i]=T[j]+1;
						solutionArr[i]=j;
					}
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			if(T[maxIndex] < T[i]) {
				maxIndex = i;
			}
		}
		
		int t = maxIndex;
		int max = maxIndex;
		do {
			t=max;
			System.out.println("Values :"+arr[t]);
			max=solutionArr[t];
		}while(t!=max);
		System.out.println();
		return T[maxIndex];
	}
	
	public static void main(String[] args) {
		LengthLongestIncreasingSub obj = new LengthLongestIncreasingSub();
		int[] array = {3,4,-1,0,6,2,3};
		System.out.println("Leangth of max increasing subsequence is :"+obj.longestCommonSubsequence(array));
	}
	
}
