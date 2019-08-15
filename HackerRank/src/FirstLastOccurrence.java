import java.util.ArrayList;
import java.util.List;

public class FirstLastOccurrence {
	public static void getRange(int[] a, int target) {
		int counter = 0;
		List<Integer> list = new ArrayList<>();
		for (int i : a) {
			counter++;
			if (i == target) {
				list.add(counter);
			} 
		}
		if(list.size() > 1)	System.out.println(list.get(0) + " " + list.get(list.size() - 1));
		else System.out.println("-1,-1");
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 3, 5, 7, 8, 9, 9, 9, 15 };
		int[] b = { 100, 150, 150, 153 };
		int[] c = { 1, 2, 3, 4, 5, 6, 10 };
		 getRange(a, 9);
		 getRange(b, 150);
		 getRange(c, 9);
	}
}
