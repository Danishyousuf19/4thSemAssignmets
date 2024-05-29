import java.util.*;
import java.util.concurrent.locks.*;

public class UnsynchBank2Test2 extends Thread {
	public static final int NACCOUNTS = 100;
	public static final double INITIAL_BALANCE = 1000;
	public static final double MAX_AMOUNT = 1000;
	public static final int DELAY = 10;

	public static void main(String[] args) {
		var Bank2 = new Bank2(NACCOUNTS, INITIAL_BALANCE);
		for (int i = 0; i < NACCOUNTS; i++) {
			int fromAccount = i;
			Runnable r = () -> {
				try {
					while (true) {
						int toAccount = (int) (Bank2.size() * Math.random());
						double amount = MAX_AMOUNT * Math.random();
						Bank2.transfer(fromAccount, toAccount, amount);
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

class Bank2 {
	private final double[] accounts;
	private Lock Bank2Lock;
	private Condition sufficientFunds;

	public Bank2(int n, double initialBalance) {
		accounts = new double[n];
		Arrays.fill(accounts, initialBalance);
		Bank2Lock = new ReentrantLock();
		sufficientFunds = Bank2Lock.newCondition();
	}

	public void transfer(int from, int to, double amount) throws InterruptedException {
		Bank2Lock.lock();
		try {
			while (accounts[from] < amount)
				sufficientFunds.await();
			System.out.print(Thread.currentThread());
			accounts[from] -= amount;
			System.out.printf(" %10.2f from %d to %d", amount, from, to);
			accounts[to] += amount;
			System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
			sufficientFunds.signalAll();
		} finally {
			Bank2Lock.unlock();
		}
	}

	public double getTotalBalance() {
		Bank2Lock.lock();
		try {
			double sum = 0;
			for (double a : accounts)
				sum += a;
			return sum;
		} finally {
			Bank2Lock.unlock();
		}
	}

	public int size() {
		return accounts.length;
	}
}