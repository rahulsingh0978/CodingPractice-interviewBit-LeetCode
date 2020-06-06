package leetcode;

public class test {

	public int majorityElement(final List<Integer> A) {

		if (A == null)
			return -1;

		int maj = A.get(0);
		int count = 1;
		int n = A.size();

		for (int i = 1; i < n; i++) {
			if (A.get(i) == maj) {
				count++;
			} else if (count == 1) {
				maj = A.get(i);
			} else {
				count--;
			}
		}

		count = 0;

		for (int i = 0; i < n; i++) {
			if (A.get(i) == maj)
				count++;
		}

		if (count > n / 2)
			return maj;

		return -1;

	}

}
