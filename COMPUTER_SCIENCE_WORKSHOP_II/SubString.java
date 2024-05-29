
public class SubString {
	static boolean chk(String s, String t) {
		int i = 0, j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				
				i++;
				j++;
			} else {
				
				i = i - j + 1;
				j = 0;
			}
		}
		
		return j == t.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(chk("inindd", "ind"));
	}

}
