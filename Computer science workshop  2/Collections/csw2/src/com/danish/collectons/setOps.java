package com.danish.collectons;

import java.util.HashSet;
import java.util.Set;

public class setOps {
	void opperations() {
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		s1.add(12);
		s1.add(14);
		s1.add(13);
		s2.add(4);
		s2.add(12);
		s2.add(10);
//		
		System.err.println("FOR UNION USE Set.addAll()");
		Set<Integer> s3 = new HashSet<>();
		s3.addAll(s1);
		s3.addAll(s2);
		System.out.println(s3.toString());
//		
		System.err.println("\nFOR INTERSECTION USE Set.retainAll()");
		Set<Integer> s4 = new HashSet<>();
		s4.addAll(s1);
		s4.retainAll(s2);
		System.out.println(s4.toString());
//		
		System.err.println("\nFOR DIFFERENCE USE Set.removeAll()");
		Set<Integer> s5 = new HashSet<>();
		s5.addAll(s1);
		s5.removeAll(s2);
		System.out.println(s5.toString());
//		
		System.err.println("\nFOR SUBSET USE Set.containsAll()");
		Set<Integer> s6 = new HashSet<>();
		s1.addAll(s2);
		s6.addAll(s1);
		s6.containsAll(s1);
		s6.containsAll(s2);
		System.out.println(s6.toString());
		
	}
}
