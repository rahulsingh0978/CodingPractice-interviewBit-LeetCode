package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubsetCombination {
	public List<List<Integer>> subsets(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i : nums) {
			map.compute(i, (key, val) -> {
				if (val == null) {
					return 1;
				} else {
					return val + 1;
				}
			});
		}
		int[] inp = new int[map.size()];
		int[] count = new int[map.size()];
		int i = 0;
		for (Map.Entry<Integer, Integer> val : map.entrySet()) {
			inp[i] = val.getKey();
			count[i] = val.getValue();
			i++;
		}
		List<List<Integer>> result = new ArrayList();
		int[] op = new int[n];
		helper(inp,count,result,op,0,0);
		return result;
	}
	public void helper(int[] ip,int[] count,List<List<Integer>> result,int[] op,int pos, int len) {
		System.out.println("pos: "+ pos);
		for(int i=0;i<len;i++) {
			System.out.print(" "+op[i]);
		}
		System.out.println();
		//position should be triggered by the loop
		for(int i=pos;i<ip.length ;i++) { // 1,2,3   1
			if(count[i]==0) {
				continue;
			}
			op[len] = ip[i];
			count[i]--;
			helper(ip,count,result,op,i,len+1);
			count[i]++;
		}
	}
	public static void main(String[] args) {
		SubsetCombination obj = new SubsetCombination();
		int[] nums = { 15, 20, 12, 19, 4};
		obj.subsets(nums);
	}
}
