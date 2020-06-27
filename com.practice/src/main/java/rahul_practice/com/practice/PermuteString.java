package rahul_practice.com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class PermuteString {
	public static void stringpermute(int[] ip,int [] count, int[] result, int level) {
		if(level==result.length) {
			for(int i:result) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
		else {
			for(int i=0;i<ip.length;i++) {
				if(count[i]==0) {
					continue;
				}
				result[level]=ip[i];
				count[i]--;
				stringpermute(ip,count,result,level+1);
				count[i]++;
				
			}
		}
	}
	public static void main(String[] args) {
		PermuteString obj = new PermuteString();
		int[] ip = {1,2,3};
		Map<Integer,Integer> map = new HashMap();
		for(int i:ip) {
			map.compute(i, (key,val)->{
				if(val==null) {
					return 1;
				}else {
					return val+1;
				}
			});
		}
		int input[] = new int[map.size()];
		int count[] = new int[map.size()];
		int i=0;
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			input[i] = m.getKey();
			count[i] = m.getValue();
			i++;
		}
		int result[] = new int[ip.length];
		obj.stringpermute(input, count,result, 0);
		
		
	}
}
