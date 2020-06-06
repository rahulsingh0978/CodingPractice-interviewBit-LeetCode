package interview;

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

public class testDataEngineer {

	/*
	 * Complete the 'maximumOccurringDigit' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING
	 * text as parameter.
	 */

	public static int maximumOccurringDigit(String text) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		int max = 0;
		char c = '1';
		int n = text.length();
		for (int i = 0; i < n; i++) {
			if (Character.isDigit(text.charAt(i))) {
				if (map.get(text.charAt(i)) == null) {
					map.put(text.charAt(i), 1);
				} else {
					map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
				}
			}

		}
		if (map.isEmpty()) {
			return -1;
		} else {
			for (Character ch : map.keySet()) {
				if (map.get(ch) > max) {
					System.out.println(ch);
					c = ch;
					max = map.get(ch);

				}
			}
			return Integer.parseInt(c + "");
		}
		// System.out.println(map.entrySet());

	}

}
