import java.util.ArrayList;

public class robinkarpsAlgo {
	static int calculatehash(String b) {
		int c = 0;
		for (char i : b.toCharArray()) {
			c = c * 10 + i - 'a';
		}
		return c;
	}

	static ArrayList<Integer> match(String a, String b) {
		ArrayList<Integer>list=new ArrayList<>();
		
		int n = a.length(), m = b.length();
		int hashvalue = calculatehash(b);
		for (int i = 0; i < n - m + 1; i++) {
			String temp = a.substring(i, i + m);
			int t = i;
			int j = 0;
			if (hashvalue == calculatehash(temp)) {
				while (j < m && t < n) {
					if (a.charAt(t) == b.charAt(j)) {
						t++;
						j++;
					} else {
						break;
					}
				}
				if (j == m) {
					list.add(i);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start : "+match("dabnishniab", "ab"));
	}

}
