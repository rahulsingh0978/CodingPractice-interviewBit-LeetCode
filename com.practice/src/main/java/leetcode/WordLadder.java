package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> lookup = new HashSet<>(wordList);
		if (!lookup.contains(endWord)) {
			return 0;
		}
		Queue<String> q = new LinkedList<>();
		q.offer(beginWord);
		int count = 0;
		while (!q.isEmpty()) {
			for (int k = q.size(); k > 0; k--) { // end every element from queue
				String val = q.poll();
				if (val.equals(endWord)) {
					return count + 1;
				}
				for (int i = 0; i < val.length(); i++) {
					char[] arr = val.toCharArray();
					for (char j = 'a'; j <= 'z'; j++) {
						arr[i] = j;
						String changedValue = new String(arr);
						if (lookup.contains(changedValue) && !val.equals(changedValue)) {
							//System.out.println(changedValue);
							q.offer(changedValue);
							lookup.remove(changedValue); // add all the edit distance possible by 1.
						}
					}
				}

			} // count at the end to only consider the one next and remove the unnecessary jumps.
			count++;
		}
		return 0;
	}

	public static void main(String[] args) {
		WordLadder obj = new WordLadder();
		String s = "hit";
		String e = "cog";
		List<String> st = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
		System.out.println(obj.ladderLength(s, e, st));
	}
}
