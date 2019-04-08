
public class TimeConversion {
	static String timeConversion(String s) {
		String am = "AM";
		String pm = "PM";
		String result = null;
			if(s.contains(am)) {
				String k = s.substring(0, 2);
				int p = Integer.parseInt(k);
				int t = p % 12;
				String leadingZeros = String.format("%02d", t);
				result = leadingZeros +""+ s.substring(2,8);
			}
			if(s.contains(pm)) {
				String k = s.substring(0, 2);
				int p = Integer.parseInt(k);
				int t = p % 12;
				int q = t + 12;
				result = q +""+ s.substring(2,8);
			}
			System.out.println(result);
		return result;
    }
public static void main(String[] args) {
	timeConversion("11:40:03AM");
}
}
