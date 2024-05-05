package com.danish.collectons;

import java.util.*;

public class arrayList {
	@SuppressWarnings("unchecked")
	public void arraylist() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(2);
		list.sort(Comparator.naturalOrder());
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\nsize : " + list.size());
		System.out.println("2 in list : " + list.contains(2));
		System.out.println("2 at index : " + list.indexOf(2));
		System.out.println("2 at index from back : " + list.lastIndexOf(2));
		ArrayList<Integer> clon = new ArrayList<>();
		clon.ensureCapacity(3);
		clon = (ArrayList<Integer>) list.clone();
		clon.add(7);
		clon.retainAll(list);
		List<Integer> sub = clon.subList(0, 2);
//		clon.trimToSize();
		System.out.println("hash value  : "+clon.get(3).hashCode());
		Iterator<Integer> it2 = clon.iterator();
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		Iterator<Integer> it3 = sub.iterator();
		while (it3.hasNext()) {
			System.out.print(it3.next() + " ");
		}
//		list.
		list.clear();
		System.out.println("\nIs Empty : " + list.isEmpty());

	}
}