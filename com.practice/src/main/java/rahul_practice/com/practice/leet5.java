package rahul_practice.com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leet5 {
	public static int maxSubStringLen1(String s) {
		Set<Character> set = new HashSet<>();
		int n = s.length();
		int i = 0, j = 0, ans = 0;
		while (i < n && j < n) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = ans > (j - i) ? ans : j - i;
			} else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}

	public static int maxSubStringLen2(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int n = s.length();
		int ans = 0;
		for (int i = 0,k=0, j = 0; j < n; j++) {
			if(map.containsKey(s.charAt(j))) {
				k=Math.max(map.get(s.charAt(j)),k);
				i=map.get(s.charAt(j));
			}
			ans = Math.max(ans, j-i+1);
			map.put(s.charAt(j), j+1);
			
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
		return ans;
	}
	
	public static void main(String[] args) {
		String s="abba";
		System.out.println(maxSubStringLen1(s));
		System.out.println(maxSubStringLen2(s));
	}
}