package interviewBits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ABCDInterviewMock {

	public int[] equal(int[] A) {
		Map<Integer, List<Integer>> map = new HashMap();
		List<Integer> elements;
		int counter = 0;
		for (int a1 = 0; a1 <= A.length - 1; a1++) {
			for (int b1 = a1 + 1; b1 <= A.length - 1; b1++) {
				int sum = A[a1] + A[b1];

				if (!map.containsKey(sum)) {
					elements = new ArrayList<Integer>();
					elements.add(a1);
					elements.add(b1);
					map.put(sum, elements);
				} else {
					List<Integer> value = map.get(sum);
					if (value.get(0) < value.get(1) && a1 < b1 && value.get(0) < a1 && value.get(1) != b1
							&& value.get(1) != a1 && value.get(1) < a1 && value.get(1) < b1) {

						int[][] out = new int[4][10];
						out[counter][0] = value.get(0);
						out[counter][1] = value.get(1);
						out[counter][2] = a1;
						out[counter][3] = b1;
						counter++;
						// return out;
					}
				}

			}
		}

		return new int[4];
	}
}

/*
 * 
 * A1<B1 < C1< D1
 * 
 * 1 < 4< 2 <9
 * 
 * A[A1] + A[B1] = A[C1] + A[D1] A1 < B1, C1 < D1 A1 < C1, B1 != D1, B1 != C1
 * 
 * S1 is lexicographically smaller than S2 iff A1 < A2 OR A1 = A2 AND B1 < B2 OR
 * A1 = A2 AND B1 = B2 AND C1 < C2 OR A1 = A2 AND B1 = B2 AND C1 = C2 AND D1 <
 * D2
 * 
 * 
 * 
 * i = 0 j = 1 key =[3, 4, 7, 1, 2, 9, 8] 3+8 , 4+7 map { 7 , [0,1], 10 , [0,2],
 * 4 , [0,3], 5 , [0,4], 12 , [0,5],
 * 
 * 
 * }
 * 
 */
