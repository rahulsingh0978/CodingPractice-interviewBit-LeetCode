package rahul_practice.com.practice;

import java.util.HashMap;
import java.util.Map;

public class CombinationString {
	public void combinationString(int[] input,int[] count,int pos,int result[],int level) {
		for(int i=0;i<level;i++) {
			System.out.print(" "+result[i]);
		}
		System.out.println();
		for(int i=pos;i<input.length;i++) {
			if(count[i]==0) {
				continue;
			}
			count[i]--;
			result[level]=input[i];
			combinationString(input,count,i,result,level+1);
			count[i]++;
			
		}
	}
	public static void main(String[] args) {
		CombinationString obj = new CombinationString();
		int[] ip = {1,2,3,3};
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
		System.out.println(" asa "+map.size());
		int count[] = new int[map.size()];
		int i=0;
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			input[i] = m.getKey();
			count[i] = m.getValue();
			i++;
		}
		int result[] = new int[ip.length];
		obj.combinationString(input, count, 0, result, 0);
	}

}
