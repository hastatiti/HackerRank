
public class DiagonalDifference {
	static int diagonalDifference(int[][] arr) {
		int primaryDiaganal = 0;
		int secondaryDiaganal = 0;

		for (int i = 0; i < arr.length; i++) {
			int k = arr[i].length;
			for (int j = 0; j < arr[i].length; j++) {
				k--;
				if (i == j) {
					primaryDiaganal += arr[i][j];
					secondaryDiaganal += arr[i][k];
				}
			}
		}
		int difference = Math.abs(primaryDiaganal - secondaryDiaganal);
		return difference;
	}

	public static void main(String[] args) {
		int[][] arr = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };
		System.out.println(diagonalDifference(arr));
	}
}
