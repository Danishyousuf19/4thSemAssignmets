
public class lowerToUpper {
	static String ReverseEachChar(String s) {
//	upper[65,90]lower[97,122] differ=32
		int n = s.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (c >= 65 && c <= 90) {
				sb.append((char) (c + 32));
			} else if (c >= 97 && c <= 122) {
				sb.append((char) (c - 32));
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseEachChar("DanIshYouSUF"));
	}

}
