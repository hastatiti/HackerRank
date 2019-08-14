import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jaguar {
	public static int add(String s) {
		if(s.length() == 0) return 0;
		if(s.length() == 1) return Integer.parseInt(s);
		List<String> list = new ArrayList<>();
		list = Arrays.asList(s.split(",|\n"));
		int i = 0;
		for(String a : list) {
			 i += Integer.parseInt(a);
		}
		return i;
		
	}
	public static void main(String[] args) {
		System.out.println(add("1\n2,3"));
	}
}
