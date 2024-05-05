
public class FindAllAreUniqueChar {
	static void areUnique(String s, int n) {
		boolean flag[] = new boolean[26];
		for (int i = 0; i < n; i++) {
			if (flag[s.charAt(i) - 'a']) {
				System.out.println("Not unique");
				return;
			} else {
				flag[s.charAt(i) - 'a'] = true;
			}

		}
		System.out.println("yes unique");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areUnique("danish", 6);
	}

}
