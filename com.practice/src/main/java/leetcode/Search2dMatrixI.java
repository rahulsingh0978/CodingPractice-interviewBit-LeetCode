package leetcode;

public class Search2dMatrixI {
	public boolean searchMatrix(int[][] matrix, int target) {
		int r = matrix.length;
		if (r == 0) {
			return false;
		}
		int c = matrix[0].length;
		if (c == 0) {
			return false;
		}
		int l = 0;
		int h = r * c - 1;
		while (l <= h) {
			int mid = (l + h) / 2;
			int i = mid / c;
			int j = mid % c;
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] > target) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Search2dMatrixI obj = new Search2dMatrixI();
		int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		System.out.println(obj.searchMatrix(mat, 13));
	}
}
