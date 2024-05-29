
public class ThreadsImplementingRunabble implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("Main-0");
		System.out.println("Running " + Thread.currentThread().getName() + ", id-" + Thread.currentThread().getId()
				+ " state-" + Thread.currentThread().getState() + " Priority-" + Thread.currentThread().getPriority());
		ThreadsImplementingRunabble t = new ThreadsImplementingRunabble();
		System.out.println("Running " + Thread.currentThread().getName() + ", id-" + Thread.currentThread().getId()
				+ " state-" + Thread.currentThread().getState() + " Priority-" + Thread.currentThread().getPriority());
		Thread h = new Thread(t);
		System.out.println("Running " + h.getName() + ", id-" + h.getId() + " state-" + h.getState());

		h.start();
		System.out.println("Running " + Thread.currentThread().getName() + ", id-" + Thread.currentThread().getId()
				+ " Priority-" + h.getPriority());
		Thread h2 = new Thread(t);
		System.out.println("Running " + h2.getName() + ", id-" + h2.getId() + " state-" + h2.getState());
		h2.setPriority(10);
		h2.start();
		Thread h3 = new Thread(t);
		System.out.println("Running " + h3.getName() + ", id-" + h3.getId() + " state-" + h3.getState());
		h3.setPriority(1);
		h3.start();

	}

	@Override
	public void run() {
		try {
			System.out.println(
					"Running " + Thread.currentThread().getName() + ", id-" + Thread.currentThread().getId() + " state-"
							+ Thread.currentThread().getState() + " Priority-" + Thread.currentThread().getPriority());

			Thread.sleep(1000);

		} catch (InterruptedException r) {
			r.printStackTrace();
		}
	}

}
