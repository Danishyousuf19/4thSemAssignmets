
public class Reverse {
	static void reverse(String s) {
		int j = s.length() - 1;
		char chars[] = s.toCharArray();
		int i = 0;
		while (i < j) {
			swap(chars, i, j);
			i++;
			j--;
		}
		StringBuilder sb = new StringBuilder();
		for (char c : chars) {
			sb.append(c);
		}
		System.out.println(sb.toString());

	}

	static void swap(char ch[], int i, int j) {
		char c = ch[i];
		ch[i] = ch[j];
		ch[j] = c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("DanishAhmad");
	}

}
