package rahul_practice.com.oopsbasic;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static int[][] solution(int[] indices, int k) {
        // write your code in Java SE 8
        int n = indices.length;
        int multiple = n%k>0?n/k+1:n/k;
        //int[][] val = new int[n/k][n/k];
        int[][] bucket = new int[k][multiple];
        int m=0;
        for(int i=0 ; i<k; i++){
            for(int j=0;j<multiple;j++){
                if(m<n){
                bucket[i][j]= indices[m++];
                System.out.print(bucket[i][j]+" ");
                }
                
        }
            System.out.println();
            
            
            
        
    }
        int[][] ans = new int[2*k][n-1];
       
        int g=0,o=0;
        
        for(int i =0 ; i < k ; i++) {
        	
        	for(int j = 0 ; j<k;j++) {
        		
        		ans[2*i]=bucket[i];
        		ans[2*i+1] = getMergedArray(bucket,i,k);
        		
        	}
        	
        }
        /*
        for(int i=0 ; i<2*k &&g<k;i++,g++) {
        	for(int j=0 ;j<2&&o<multiple;j++,o++) {
        		for(int l =0;l<k;l++)
        		{ 
        			ans[i][j] = bucket[g][o];
        		} 
        	}
        }
        */
        return ans;
	}
	
	public static int[] getMergedArray(int[][] bucket, int j,int k) {
		int[] a = new int[100]; 
		
		List<Integer>  p = new ArrayList();
		
		for(int i =0; i<k;i++ ) {
			if(j!= i) {
				List<Integer>  pp = new ArrayList(Arrays.asList(bucket[i]));
				p.addAll(pp);
			}
			
		}
		//list.stream().mapToInt(i->i).toArray();
		//ArrayUtils.toPrimitive(myList.toArray(new Integer[myList.size()]));
		int ps = p.size();
		for(int i =0;i<p.size();i++) {
			System.out.println(a[i]+"adsasda "+p.get(i));
			a[i] = (int) p.get(i);
		}
		return a;
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int k = 2;
		int [][] mat = Solution.solution(arr, k);
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
	}
}

