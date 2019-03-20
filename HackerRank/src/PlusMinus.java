import java.text.DecimalFormat;

public class PlusMinus {
	static void plusMinus(int[] arr) {
		double positive = 0;
		double negative = 0;
		double zero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				zero++;
			if (arr[i] < 0)
				negative++;
			if (arr[i] > 0)
				positive++;
		}
		double total = arr.length;
		double a = positive / total;
		double b = negative / total;
		double c = zero / total;

		DecimalFormat numberFormat = new DecimalFormat("#0.000000");
		System.out.print(numberFormat.format(a) + "\n"  + numberFormat.format(b) + "\n" + numberFormat.format(c));
	}

	public static void main(String[] args) {
		int[] arr = { -4, 3, -9, 0, 4, 1 };
		plusMinus(arr);
	}
}
