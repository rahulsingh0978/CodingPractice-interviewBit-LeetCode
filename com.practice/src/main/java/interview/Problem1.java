package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.jar.Manifest;

public class Problem1 {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 3, 7, 9, 11, 5, 3, 5, 3, 7, 9, 9, 11 };
		Map<Integer, Integer> map = new HashMap();
		for (int i : arr) {

			map.put(i, map.getOrDefault(i, 0) + 1);

		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println();
		List<Entry<Integer, Integer>> result = new LinkedList(map.entrySet());

		Collections.sort(result, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}

		});

		for (Entry<Integer, Integer> e : result) {
			System.out.println(e.getKey());
		}

	}

}
