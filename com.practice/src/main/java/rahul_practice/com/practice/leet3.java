package rahul_practice.com.practice;

import java.util.HashMap;
import java.util.Map;

public class leet3 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String s = "pwwkew";
		String[] a = s.split("");
		int count = 1,maxCount=0;
		
		for (int i = 1; i < a.length; i++) {
			if(a[i]!=a[i-1]) {
				count++;
			}else {
				count=1;
			}
			if(maxCount<count) {
				maxCount = count;
			}
			
		}
		System.out.println(maxCount);
		
	}
}
