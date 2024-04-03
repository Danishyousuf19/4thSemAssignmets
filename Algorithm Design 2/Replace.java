
public class Replace {
	static String replace(String s, char c, String t) {
		if (s.indexOf(c) == -1) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		for (char d : s.toCharArray()) {
			if (d == c) {
				sb.append(t);
			} else {
				sb.append(d);
			}
		}
		return sb.toString();
	}

	static String removeWith_(String s, char c) {
		return replace(s, c, "_");
	}

	static String removeWith(String s, char c) {
		String a = replace(s, c, "");
		int n = a.length(), m = s.length();
		while (n < m) {
			a += "_";
			n++;
		}
		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replace("odq0oqd", 'q', "ZZZ"));
		System.out.println(removeWith_("danishahmad", 'a'));
		System.out.println(removeWith("danishahmad", 'a'));
	}

}
