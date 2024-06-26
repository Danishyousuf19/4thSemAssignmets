import java.util.*;

public class UnsynchBank3Test3 extends Thread {
	public static final int NACCOUNTS = 100;
	public static final double INITIAL_BALANCE = 1000;
	public static final double MAX_AMOUNT = 1000;
	public static final int DELAY = 10;

	public static void main(String[] args) {

		var Bank3 = new Bank3(NACCOUNTS, INITIAL_BALANCE);
		for (int i = 0; i < NACCOUNTS; i++) {
			int fromAccount = i;
			Runnable r = () -> {
				
				try {
					while (true) {
						int toAccount = (int) (Bank3.size() * Math.random());
						double amount = MAX_AMOUNT * Math.random();
						Bank3.transfer(fromAccount, toAccount, amount);
						Thread.sleep((int) (DELAY * Math.random()));
					}
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			};
			new Thread(r).start();
		}

	}
}

class Bank3 {
	private final double[] accounts;

	public Bank3(int n, double initialBalance) {
		accounts = new double[n];
		Arrays.fill(accounts, initialBalance);

	}

	public synchronized void transfer(int from, int to, double amount) throws InterruptedException {

		try {
			while (accounts[from] < amount)wait();

				System.out.println(Thread.currentThread());
			accounts[from] -= amount;
			System.out.printf(" %10.2f from %d to %d", amount, from, to);
			accounts[to] += amount;
			System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());

		} finally {

		}
		notifyAll();
	}

	public synchronized double getTotalBalance() {

		try {
			
			double sum = 0;
			for (double a : accounts)
				sum += a;
			
			return sum;

		} finally {

		}
	}

	public int size() {
		return accounts.length;
	}
}