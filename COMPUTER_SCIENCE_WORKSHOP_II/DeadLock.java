class A {
	synchronized void m1(D d) {
		System.out.println("M1 A");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		System.out.println("calling D.F form A");
		d.F();
	}

	synchronized void F() {
		System.out.println("I m first of A");

	}
}

class D {
	synchronized void m1(A a) {
		System.out.println("M1 D ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		System.out.println("calling A.F form B");
		a.F();
	}

	synchronized void F() {
		System.out.println("I m first of D");

	}
}

public class DeadLock extends Thread { 
	A a = new A();
	D d = new D();

	void G() {
		this.start();
		a.m1(d);
	}

	public void run() {
		d.m1(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stuD
		DeadLock l = new DeadLock();
		l.G();
	}

}
