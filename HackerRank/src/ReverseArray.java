import java.util.Arrays;

public class ReverseArray {
	 static int[] reverseArray(int[] a) {
		 int[] myArray = new int [a.length];
		 int j = 0;
		for(int i =  a.length - 1; i >= 0; i--) {
			myArray[j++] = a[i];
		}
		System.out.println(Arrays.toString(myArray));
		return myArray;
	    }
	 public static void main(String[] args) {
		int [] a = {1, 2, 3, 4};
		reverseArray(a);
	}
}
