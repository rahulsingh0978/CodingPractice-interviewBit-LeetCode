package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
	public static List<Integer> partitionLabels(String S) {
		if(S.length()==0) {
			return null;
		}
		List<Integer> lst = new ArrayList();
		
		int n = S.length();
		int[] arr = new int[26];
		for(int i=0;i<n;i++) {
			arr[S.charAt(i)-'a'] = i;
		}
		int s = 0;
		int e = 0;
		for(int i=0;i<n;i++) {
			e = Math.max(e, arr[S.charAt(i)-'a']);
			//while traversing the string you get the highest ending and when the index of the element and end match you get the partition end
			if(i==e) {
				lst.add(e-s+1);
				s=e+1;
			}
		}
		
		
		return lst;
	}

	public static void main(String[] args) {
		System.out.println(PartitionLabels.partitionLabels("ababcbacadefegdehijhklij"));
	}
}
