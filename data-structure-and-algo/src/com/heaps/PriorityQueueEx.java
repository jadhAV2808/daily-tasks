package com.heaps;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {

		PriorityQueue <Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(25);
		pq.add(-22);
		pq.add(1343);
		pq.add(54);
		pq.add(0);
		pq.add(-3492);
		pq.add(422);
		
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.remove(54));
		System.out.println(pq.peek());
		

	}

}
