package interviewBits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LowHigh {
	int low, high;

	LowHigh(int low, int high) {
		this.low = low;
		this.high = high;
	}
}

public class TextFormatting {

	public static int textFormatting(List<Integer> starting, List<Integer> ending, List<Character> style) {
		// Write your code here

		Map<Character, List<LowHigh>> map = new HashMap();
		int operations = 0;
		for (int i = 0; i < starting.size(); i++) {
			if (!map.containsKey(style.get(i))) {
				LowHigh obj = new LowHigh(starting.get(i), ending.get(i));
				List<LowHigh> lst = new ArrayList();
				lst.add(obj);
				// lst.add(starting.get(i));
				// lst.add(ending.get(i));
				map.put(style.get(i), lst);
				operations++;
			} else {
				for (LowHigh item : map.get(style.get(i))) {
					int start = item.low;
					int end = item.high;
					if (starting.get(i) < start && ending.get(i) > end) {
						operations++;
						List<Integer> lst = new ArrayList<>();
						lst.add(start);
						lst.add(end);
						map.put(style.get(i), lst);
					} else if (starting.get(i) < start) {
						map.get(style.get(i)).remove(0);
						// lst.remove(0);
						map.get(style.get(i)).add(0, starting.get(i));
						// map.put(style.get(i),lst);
						operations++;
					} else if (ending.get(i) > end) {
						// List<Integer> lst = map.get(i);
						map.get(style.get(i)).remove(1);
						map.get(style.get(i)).add(1, ending.get(i));
						// map.put(style.get(i),lst);
						operations++;
					} else if (starting.get(i) > end) {

					} else if (ending.get(i) < start) {

					}

				}
				// int start = map.get(style.get(i));
				// int end = map.get(style.get(i)).get(1);
				if (starting.get(i) < start && ending.get(i) > end) {
					operations++;
					List<Integer> lst = new ArrayList<>();
					lst.add(start);
					lst.add(end);
					map.put(style.get(i), lst);
				} else if (starting.get(i) < start) {
					map.get(style.get(i)).remove(0);
					// lst.remove(0);
					map.get(style.get(i)).add(0, starting.get(i));
					// map.put(style.get(i),lst);
					operations++;
				} else if (ending.get(i) > end) {
					// List<Integer> lst = map.get(i);
					map.get(style.get(i)).remove(1);
					map.get(style.get(i)).add(1, ending.get(i));
					// map.put(style.get(i),lst);
					operations++;
				}
			}

		}
		return operations;
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'textFormatting' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY starting 2. INTEGER_ARRAY ending 3.
	 * CHARACTER_ARRAY style
	 */

	public static int textFormatting(List<Integer> starting, List<Integer> ending, List<Character> style) {
		// Write your code here

		Integer max = Collections.max(ending);
		String[] output = new String[max + 1];
		for (int i = 0; i < output.length; i++) {
			output[i] = "";

		}
		int operations = 0;
		int currentStart = starting.get(0);
		int currentEnd = ending.get(0);
		for (int i = 0; i < starting.size(); i++) {
			if (!(i > 0 && currentStart == starting.get(i) && currentEnd == ending.get(i))) {
				operations++; // for selection
			}
			boolean opera = false;

			for (int j = starting.get(i); j < ending.get(i); j++) {
				if (!output[j].contains(style.get(i) + "")) {
					opera = true;
					output[j] += style.get(i);
				}
			}
			if (opera) {
				operations++; // for text alter

			}
			currentStart = starting.get(i);
			currentEnd = ending.get(i);
		}
		return operations;
	}

	

	public static void main(String[] args) {
		TextFormatting obj = new TextFormatting();
		List<Integer> starting = new ArrayList();
		starting.add(1);
		starting.add(17);
		starting.add(3);
		starting.add(3);
		starting.add(1);
		starting.add(13);
		List<Integer> ending = new ArrayList();
		ending.add(5);
		ending.add(20);
		ending.add(8);
		ending.add(12);
		ending.add(1);
		ending.add(18);
		List<Character> style = new ArrayList();
		style.add('b');
		style.add('b');
		style.add('i');
		style.add('i');
		style.add('u');
		style.add('u');

		System.out.println(obj.textFormatting(starting, ending, style));
		
		
		

	}
}
