package com.danish.collectons;

import java.util.*;

public class queueDeQue {
	Deque<Integer> q;

	void user() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("---choose Option---\na --> Enque\nb --> Deque\nc --> peek\np --> print\n"
				+ "d --> contains\ne --> size\nx --> exit");
		System.out.println("do you want to create Queue :enter y/n");
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
			i++;
			switch (f) {
			case 'a':
				System.out.println("Enter number");
				int v = sc.nextInt();
				q.offer(v);
				break;
			case 'b':
				if (q.isEmpty())
					System.err.println("empty Queue");
				else
					System.out.println("number removed = " + q.removeFirst());
				break;
			case 'c':
				if (q.isEmpty())
					System.out.println("empty queue");
				else
					System.out.println(q.peekFirst());
				break;
			case 'p': {
				if (q.isEmpty())
					System.err.println("empty Stack");
				else
					System.out.println(q.toString());
				break;
			}
			case 'e':
				System.out.println("size = " + q.size());
				break;
			case 'd':
				System.out.println("enter number");
				System.out.println("contains = " + q.contains(sc.nextInt()));
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
		q = new LinkedList<>();
	}
}
