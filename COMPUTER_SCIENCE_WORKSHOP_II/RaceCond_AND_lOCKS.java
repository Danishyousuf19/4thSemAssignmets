import java.util.concurrent.locks.ReentrantLock;

public class RaceCond_AND_lOCKS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		Inc a = new Inc();
		for (int i = 0; i < 1000; i++) {
			Thread t = new Thread(a::add);
			t.start();
		}
		System.out.println(a.get());
		Inc b = new Inc();
		for (int i = 0; i < 1000; i++) {
			b.add();
		}
		System.out.println(a.get());

	}

}

class Inc {
	private final ReentrantLock lock = new ReentrantLock();

	private int c = 0;

	public void add() {
		lock.lock();
		try {
			this.c++;
		} finally {
			lock.unlock();
		}
	}

	int get() {
		return c;
	}
}
