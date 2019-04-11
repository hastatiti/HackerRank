
public class GradingStudents {
	static int[] gradingStudents(int[] grades) {
		for (int i : grades) {
			if (i == grades[0]) continue;
			if (i == 100) {
				System.out.println(i);
			}
			if (i < 38) {
				System.out.println(i);
			}
			if (38 <= i && i <= 99) {
				String s = String.valueOf(i);// int into string
				char f = s.charAt(0); // get first character
				int n = Character.getNumericValue(f);
				char c = s.charAt(1); // get 2nd digit
				int no = Character.getNumericValue(c); // turn the digit into number
				int a = no % 5; // get modulus
				if (a == 3) {
					no = no + 2;// if last digit is 3 make it 5
				}
				if (a == 4) {
					no = no + 1; // if last digit is 4 make it 5
				}
				if (no == 10) {
					System.out.println(n + 1 + "0");
				} else
					System.out.println(n + "" + no);
			}

		}
		return grades;
	}

	public static void main(String[] args) {
		int[] a = { 4, 73, 67, 38, 33 };
		gradingStudents(a);
	}
}
