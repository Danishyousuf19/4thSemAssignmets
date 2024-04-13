package com.danish.collectons;

//import java.util.Comparator;
//import java.util.Iterator;
//import java.util.ArrayDeque;
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Queue;
import java.util.*;

public class priorityQueue {
	void heap() {
// Queue<Integer>ll=new LinkedList<>();
//	Queue<Integer>ad=new ArrayDeque<>();
//	Queue<Integer>pq=new PriorityQueue<>((a,b)->{return b-a;});
//	Queue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
//	Queue<Integer>pq=new PriorityQueue<>((a,b)->( b-a));
		Queue<Integer> pq = new PriorityQueue<>();
//	Queue<Integer>pq=new PriorityQueue<>(new Comparator<>() {
//
//		@Override
//		public int compare(Integer o1, Integer o2) {
//			// TODO Auto-generated method stub
//			return 02-o1;
//		}
//		
//	});
		pq.offer(10);
		pq.offer(50);
		pq.offer(30);
		pq.offer(20);
		pq.offer(80);
		pq.offer(60);
		System.err.printf("size : %d\npeek : %d\nisEmpty : %b\n",pq.size(),pq.peek(),pq.isEmpty());
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);

	
	try {
		System.out.println("element() : "+pq.element());
		System.out.println("remove() : "+pq.remove());
		
	}
	catch(Exception e) {
		System.out.println(e.toString());
	}
	pq.offer(10);
	pq.offer(50);
	pq.offer(30);
	pq.offer(20);
	pq.offer(80);
	pq.offer(60);

	pq.forEach(a -> {
		System.out.print(a + " ");
	});
	System.out.println();
	while(!pq.isEmpty()) {
		System.out.print(pq.poll()+" ");
	}
	

	}
}
