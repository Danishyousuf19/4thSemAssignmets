package com.danish.collectons;

import java.util.*;

public class DeQue {
	Deque<Integer> dq;

	void user() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("---choose Option---\na --> offerFirst\nb --> offerLast\nc "
				+ "--> peekFirst\nd --> peekLast\ne --> popFirst\nf --> popLast\np --> print\n"
				+ "g --> contains\nh --> size\nx --> exit");
		System.out.println("do you want to create Deque :enter y/n");
		char d = sc.next().charAt(0);
		if (d == 'y') {
			create();
		} else {
			System.err.println("Thanks for your time");
			sc.close();
			return;
		}
		System.out.println("Enter your choice");
		int i = 0;
		char f = sc.next().charAt(0);
		while (f != 'x') {
			if (i != 0) {
				System.out.println("Enter your choice");
				f = sc.next().charAt(0);
			}
			int v;
			i++;
			switch (f) {
			case 'a':
				System.out.println("Enter number");
				v = sc.nextInt();
				dq.offerFirst(v);
				break;
			case 'b':
				System.out.println("Enter number");
				v = sc.nextInt();
				dq.offerLast(v);
				break;
			case 'c':
				if (dq.isEmpty())
					System.out.println("empty deque");
				else
					System.out.println(" peek first : " + dq.peekFirst());
				break;
			case 'd':
				if (dq.isEmpty())
					System.out.println("empty deque");
				else
					System.out.println(" peek last : " + dq.peekLast());
				break;
			case 'e':
				if (dq.isEmpty())
					System.out.println("empty deque");
				else
					System.out.println(" poll first : " + dq.pollFirst());
				break;
			case 'f':
				if (dq.isEmpty())
					System.out.println("empty deque");
				else
					System.out.println(" poll last : " + dq.pollLast());
				break;
			case 'p': {
				if (dq.isEmpty())
					System.err.println("empty Stack");
				else
					System.out.println(dq.toString());
				break;
			}
			case 'h':
				System.out.println("size = " + dq.size());
				break;
			case 'g':
				System.out.println("enter number");
				System.out.println("contains = " + dq.contains(sc.nextInt()));
				break;
			case 'x':
				System.err.println("exited successfully");
				break;
			default: {
				System.out.println("Wrong option ");
			}

			}
		}
		user();
	}

	void create() {
		dq = new LinkedList<>();

	}

}
