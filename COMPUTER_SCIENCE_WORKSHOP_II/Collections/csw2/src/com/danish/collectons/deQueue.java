package com.danish.collectons;
import java.util.*;
public class deQueue {
void dequeue() {
	Deque<Integer>dq=new ArrayDeque<>();
	dq.offer(2);
	dq.offerLast(3);

	dq.pollLast();
	dq.addFirst(23);
	dq.addLast(3);
	dq.pollFirst();
	dq.pollLast();
	dq.getFirst();
	dq.getLast();
	dq.add(7);
	
	
}
}
