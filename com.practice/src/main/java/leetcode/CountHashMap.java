package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountHashMap {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
            int diff = target-nums[i];
			
			if(map.get(diff)!=null) {
				return new int[]{i,map.get(diff)};
			}
            map.put(nums[i], i);
		}
		return new int[0];
	}
	public static void main(String[] args) {
		
	}
}
