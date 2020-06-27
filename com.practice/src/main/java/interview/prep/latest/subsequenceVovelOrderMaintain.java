package interview.prep.latest;

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
	 * Complete the 'longestVowelSubsequence' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING s
	 * as parameter.
	 * 
	 */

	public static int longestVowelSubsequence(String s) {
		// int result = -1;
		Map<Character, Character> prevVovelTrack = new HashMap<Character, Character>() {
			{
				put('e', 'a');
				put('i', 'e');
				put('o', 'i');
				put('u', 'o');
			}
		};
		Map<Character, String> presentLargestSq = new HashMap<Character, String>();
		for (char current : s.toCharArray()) {
			String currLong, prevLon = null;
			if (current == 'a') {
				currLong = presentLargestSq.getOrDefault(current, "");
			} else {
				currLong = presentLargestSq.get(current);
				char prev = prevVovelTrack.getOrDefault(current, ' ');
				prevLon = presentLargestSq.get(prev);
			}

			if (prevLon == null && currLong != null) {
				updateMap(current, currLong, presentLargestSq);
			} else if (currLong == null && prevLon != null) {
				updateMap(current, prevLon, presentLargestSq);
			} else if (currLong != null && prevLon != null) {
				if (currLong.length() < prevLon.length()) {
					updateMap(current, prevLon, presentLargestSq);
				} else {
					updateMap(current, currLong, presentLargestSq);
				}
			}
		}
		if (presentLargestSq.get('u') == null) {
			return 0;
		}

		return presentLargestSq.get('u').length();
	}

	public static void updateMap(char current, String currLong, Map<Character, String> presentLargestSq) {
		String curString = currLong + current;
		presentLargestSq.put(current, curString);
	}
}

public class subsequenceVovelOrderMaintain {
	public static void main(String[] args) {

		String s = "aeiaaioooaauuaeiu";
		System.out.println(Result.longestVowelSubsequence(s));
	}

}
