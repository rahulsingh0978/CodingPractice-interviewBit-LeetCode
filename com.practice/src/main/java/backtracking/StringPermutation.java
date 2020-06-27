package backtracking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringPermutation {

	public void permuteUtil(char[] str) {
		Map<Character, Integer> map = new HashMap<>();

		for (char i : str) {
			map.compute(i, (key, val) -> {
				if (val == null) {
					return 1;
				} else {
					return val + 1;
				}
			});
		}
		int[] count = new int[map.size()];
		char[] characters = new char[map.size()];
		int i = 0;
		for (Map.Entry<Character, Integer> m : map.entrySet()) {

			characters[i] = m.getKey();
			count[i] = m.getValue();
			i++;
		}
		char[] result = new char[str.length];
		printPermutation(characters, count, 0, result);
	}

	public void printPermutation(char[] inputs, int[] counts, int level, char[] results) {
		if (level == results.length) {
			for (int i = 0; i < results.length; i++) {
				System.out.print(results[i]);
			}
			System.out.println();
		} else {
			for (int i = 0; i < inputs.length; i++) {
				if (counts[i] == 0) {
					continue;
				}
				results[level] = inputs[i];
				counts[i]--;

				printPermutation(inputs, counts, level + 1, results);

				counts[i]++;
			}
		}
	}

	////

	public List<String> getPermutation(String s1) {
		List<String> items = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			map.compute(s1.charAt(i), (key, val) -> {
				if (val == null) {
					return 1;
				} else {
					return val + 1;
				}
			});
		}
		int[] count = new int[map.size()];
		char[] chars = new char[map.size()];
		int j = 0;
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			count[j] = m.getValue();
			chars[j] = m.getKey();
			j++;
		}
		char[] result = new char[s1.length()];
		permute(count, chars, items, 0, result);
		return items;
	}

	public void permute(int[] count, char[] ch, List<String> s, int level, char[] result) {
		if (level == result.length) {
			StringBuffer value = new StringBuffer();
			for (int i = 0; i < result.length; i++) {
				value.append(result[i]);
			}
			s.add(value.toString());
		} else {
			for (int i = 0; i < count.length; i++) {
				if (count[i] == 0) {
					continue;
				}
				count[i]--;
				result[level] = ch[i];
				permute(count, ch, s, level + 1, result);
				count[i]++;
			}
		}
	}

	public static void main(String[] args) {
		StringPermutation obj = new StringPermutation();
		char[] input = { 'a', 'b', 'c', 'a' };
		// obj.permuteUtil(input);

		String s1 = "ai";
		String s2 = "iawew";
		int r = 0;
		// List<String> l = obj.getPermutation(s1);
		// System.out.println(l.size());
		for (int i = 0; i < s1.length(); i++) {
			r = r ^ s1.charAt(i);
		}
		for (int j = s1.length(); j < s2.length(); j++) {

		}
		System.out.println(r);
		

	}
}
