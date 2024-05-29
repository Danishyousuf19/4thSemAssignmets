class c1 extends Thread {
	public void run() {
		String t = "";
		for (int i = 0; i < 10; i++) {
			System.out.println(
					"I'm Running : T1 " + Thread.currentThread().getName() + " " + Thread.currentThread().getId());
			try {

				Thread.sleep(1000);
			} catch (Exception w) {
				System.out.println(w.getLocalizedMessage());
			}
			t += "  ";
			System.out.println(t + "T1 Sleeping for 1s");
		}
	}
}
class B extends Thread{
	public void run(){
		try {
		System.out.println("I'm Running : " + Thread.currentThread().getName() + " " + Thread.currentThread().getId());}
		catch (Exception r) {
			r.printStackTrace();
		}
	}
}
class c2 extends Thread {
	public void run() {
		String t = "";
		for (int i = 0; i < 10; i++) {
			System.out.println(
					"I'm Running : T2 " + Thread.currentThread().getName() + " " + Thread.currentThread().getId());
			try {
				Thread.sleep(2000);
			} catch (Exception w) {
				System.out.println(w.getLocalizedMessage());
			}
			t += "  ";
			System.out.println(t + "T2 Sleeping for 2s");
		}
	}
}

public class ThreadsAndRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		c2 b = new c2();b.start();
for (int i=1;i<6;i++) {
		 B s= new B();
		s.start();
}
		
		
	}

}
