class c extends Thread{
	@Override
	public void run() {
		System.out.println("Run() --c " + Thread.currentThread().isDaemon());
	}
}
public class Anagram {
	static boolean chk(String s, String t) {
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (freq[t.charAt(i)] <= 0)
				return false;
			else {

			}
		}
		return true;
	}

	

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().isDaemon());
		c a = new c();
		a.setDaemon(true);
		a.start();
		System.out.println(a.isDaemon());
	}

}
