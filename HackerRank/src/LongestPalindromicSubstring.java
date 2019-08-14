
public class LongestPalindromicSubstring {
	public static String longestPalindrome(String s) {
		return s;
	}

	public static boolean checkChar(String s) {
		int k = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(k--);
			System.out.println(k + "  " + i);
			
			if (c1 == c2) {
				System.out.println(c1 + "  " + c2);
				if (k == s.length() / 2) return true;
				checkChar(s);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "anana";
		checkChar(s);
	}
}
