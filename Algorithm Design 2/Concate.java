
public class Concate {
	static String concate(String a, String b) {
		for (char c : b.toCharArray()) {
			a += c;
		}
		return a;
	}

	static String concateInfinite(String... b) {
		String a = "";
		for (String c : b) {
			a += c;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(concateInfinite("danish", "yousuf","bhat"));
	}

}
