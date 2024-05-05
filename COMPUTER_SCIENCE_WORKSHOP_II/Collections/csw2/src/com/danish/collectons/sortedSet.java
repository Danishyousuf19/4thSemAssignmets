package com.danish.collectons;

import java.util.*;

public class sortedSet {
	void sortedset() {
		
		SortedSet<Integer> ss = new TreeSet<>();
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			ss.add(rand.nextInt(3, 15));
		}
		System.out.println("elements strictly less than 7 : (Exclusive) " + ss.headSet(7));
		System.out.println("elements  Greater than 7 or equal to : (inclusive)  " + ss.tailSet(7));
		System.out.println("subset from 4 to 9 : (inclusive)  " + ss.subSet(4, 9));
		System.out.println("first element : " + ss.first());
		System.out.println("last element : " + ss.last());

		System.out.println("comparator used : " + ss.comparator());
		Iterator<Integer> it = ss.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
