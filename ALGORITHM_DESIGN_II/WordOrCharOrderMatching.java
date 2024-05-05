
public class WordOrCharOrderMatching {
	static void matchingWord(String d, String t) {
		for (int i = 0; i <= d.length() - t.length(); i++) {
			if (d.charAt(i) == t.charAt(0)) {
				int o = i;
				int j = 0;
				boolean x = false;
				while (j < t.length() && o < d.length()) {
					if (d.charAt(o) != t.charAt(j)) {
						x = true;
						break;
					}
					j++;
					o++;
				}
				if (x == false && j == t.length()) {
					System.out.println("yes");
					return;
				}
			}
		}
		System.out.println("no");
	}

	static void matchingCharOrder(String a, String b) {
		int n = a.length(), m = b.length(), i = 0, j = 0, c = 0;
		while (i < n) {
			if (a.charAt(i) == b.charAt(j)) {
				c++;
				j++;
			}
			i++;
		}
		if (c == m) 
			System.out.println("yes");
		else 
			System.out.println("no");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("danish".length());
		System.out.println("danish".length() == "suzain".length());
		System.out.println("danish".length() % 2 == 0);
		matchingCharOrder("dansih", "dah");
		matchingWord("danish", "shg");

	}

}
