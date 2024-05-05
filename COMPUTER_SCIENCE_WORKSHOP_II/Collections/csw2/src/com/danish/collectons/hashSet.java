package com.danish.collectons;

import java.util.*;
import java.util.stream.IntStream;

public class hashSet {

	public void play() {
		Set<Integer> hs = new HashSet<>();
		Set<Integer> hs1 = new HashSet<>();
		hs.add(12);
		hs.add(14);
		hs.add(13);
		hs.add(11);
		hs1.add(4);
		hs1.add(12);
		hs1.add(10);
		hs.addAll(hs1);
		System.out.println("expected size :"+(hs.size()+5));
		Random rand = new Random();
		
		for (int i = 0; i < 5; i++) {
			hs.add(rand.nextInt(3, 15));
		}
		
		System.out.println("contains " + hs.contains(12));
		System.out.println("actual size " + hs.size());
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		hs.forEach(name -> {
			System.out.print( name+" ");
		});
		System.out.println();
		hs.retainAll(hs1);
		System.out.println(hs.toString());
		hs.removeAll(hs1);
		hs.add(2);
		System.out.println(hs.toString());
		hs.clear();
		System.out.println("empty " + hs.isEmpty());
		System.out.println(hs.toString());
		IntStream ds=rand.ints(8l,4,9);
		
		ds.forEach(name->{
			System.out.print(" "+name+" ");
		});
	

	}

}
