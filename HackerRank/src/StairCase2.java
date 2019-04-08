
public class StairCase2 {
    static void staircase(int n) {
    	int k = n;
    	if(k == 0) return;
		while (n > 0) {
			System.out.print("#");
			n = n - 1;
		}System.out.print("\n");
		staircase(k-1);
	}
    public static void main(String[] args) {
		staircase(6);
	}
}
