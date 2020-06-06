package interviewBits;

import java.util.HashMap;
import java.util.Map;

public class WindoMinSubString {
	public String minWindow(String s, String t) {
		int l = 0;
		int e = 0;
		int n = s.length();
		Map<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < t.length(); i++) {
			if (count.containsKey(t.charAt(i))) {
				count.put(t.charAt(i), count.get(t.charAt(i)) + 1);
			} else {
				count.put(t.charAt(i), 1);
			}
		}
		int minCount = Integer.MAX_VALUE;
		Map<Character, Integer> temp = new HashMap<>();
		boolean flag = true;
		int[] arr = new int[2];
		arr[0] = 0;
		arr[1] = 0;
		
		while (l <= e && e < n) {

			if (count.containsKey(s.charAt(e))) {
				if (temp.containsKey(s.charAt(e))) {
					temp.put(s.charAt(e), temp.get(s.charAt(e)) + 1);
				} else
					temp.put(s.charAt(e), 1);
			}

			while (sameMap(count, temp)) {

				if (minCount > e - l) {
					minCount = e -l;
					arr[0] = l;
					arr[1] = e;
					flag = false;
				}
				if (temp.containsKey(s.charAt(l))) {
					int val = temp.get(s.charAt(l));
					if (val > 1) {
						val--;
						temp.put(s.charAt(l), val);
					} else {
						temp.remove(s.charAt(l));
					}

					// flag=false;
				
					
				}
				l++;
			}

			e++;
		}
		if(flag) {
			return s.substring(arr[0], arr[1]);
		}else{
		return s.substring(arr[0], arr[1]+1);
		}
	}

	public boolean sameMap(Map<Character, Integer> a, Map<Character, Integer> b) {

		for (Map.Entry<Character, Integer> map1 : a.entrySet()) {

			if (!b.containsKey(map1.getKey())) {
				return false;
			} else {
				if (map1.getValue() > b.get(map1.getKey())) {
					return false;
				}
			}

		}
		return true;

	}

	public static void main(String[] args) {
		WindoMinSubString obj = new WindoMinSubString();
		Map<Character, Integer> temp = new HashMap<>();
		temp.put('a', 4);
		Map<Character, Integer> temp2 = new HashMap<>();
		temp2.put('a', 1);
		// temp2.put('c',1);
		// System.out.println(temp.equals(temp2));

		System.out.println(obj.minWindow("0mJdGXwLm9AOZ5xA8u92KDYqGJroQ537hoRXjQoUCMOpDYwxoNjexJGWQJAIxSFF3ZbIe27oFxUTJxtv8mORwpuRZn30MDj3kXRW2Ix3lslj7kwmGZPXAKhBW4q5T2BzsqbL0ZETFqRdxVm8GCGfqshvpWzsRvprUcF9vw3VlftqTRzKRzr4zYB2P6C7lg3I7EhGMPukUj8XGGZTXqPqnCqes", "rsm2ty04PYPEOPYO5"));
		System.out.println("rahul".equals("rahul"));
	}
}
