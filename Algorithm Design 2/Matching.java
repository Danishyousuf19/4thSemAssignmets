
public class Matching {
	static boolean match(String a, String b) {
		int j = 0, n = a.length(), m = b.length();
		if(n==0&&j==0) {
			return true;
		}
		if(n==0||j==0) {
			return false;
		}
		for (int i = 0; i < n; i++) {
			int t = i;
			if (a.charAt(i) == b.charAt(j)) {
				while (j < m && t < n) {
					if (a.charAt(t) == b.charAt(j)) {
						t++;
						j++;
					}
					else {
						j = 0;
						break; 
					}
				}
				if (j == m) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(match("danish", "shu"));

	}

}
