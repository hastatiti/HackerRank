import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumsList {
	public static boolean twoSum(List<Integer> list, int k) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.size(); j++) {
				int a = list.get(i);
				int b = list.get(j);
				if(a + b == k) return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>(Arrays.asList( 7, 1 , -3, 4, 2));
		System.out.println(twoSum(l, 5));
	}
}
