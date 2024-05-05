package com.danish.collectons;

import java.util.ArrayDeque;
import java.util.Deque;

import java.util.*;

public class stackDeQue {

	Deque<Integer> st;

	@SuppressWarnings( "resource")
	void user() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---choose Option---\na --> push\nb --> pop\nc --> "
				+ "peek\np --> print\n"
				+ "d --> contains\ne --> size\nx --> exit");
		System.out.println("do you want to create Stack :enter y/n");
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
			case 'a': {
				System.out.println("Enter number");
				int v = sc.nextInt();
				st.offerLast(v);
				System.out.println("do you want to enter more enter y/n");
				char p = sc.next().charAt(0);
				while (p != 'n') {
					System.out.println("Enter number");
					v = sc.nextInt();
					System.out.println("do you want to enter more enter y/n");
					p = sc.next().charAt(0);
					st.offerLast(v);
				}

				break;
			}
			case 'b': {
				if (st.isEmpty())
					System.err.println("empty Stack");
				else
					System.out.println("number removed = " + st.pollLast());
				break;
			}
			case 'c': {
				if (st.isEmpty())
					System.err.println("empty Stack");
				else
					System.out.println("top number = " + st.peekLast());
				break;
			}
			case 'p': {
				if (st.isEmpty())
					System.err.println("empty Stack");
				else
					System.out.println(st.toString());
				break;
			}
			case 'e':
				System.out.println("size = " + st.size());
				break;
			case 'd':
				System.out.println("enter number");
				System.out.println("contains = " + st.contains(sc.nextInt()));
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
		st = new ArrayDeque<>();
	}
}
