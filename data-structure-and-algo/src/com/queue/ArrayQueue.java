package com.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
	
	private Students[] queue;
	private int front;
	private int back;
	
	
	public ArrayQueue(int capacity) {
		queue=new Students[capacity];
	}
	
	public void add(Students student) {
		if(back==queue.length) {
			Students[] newArray=new Students[2*queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue=newArray;
		}
		queue[back]=student;
		back++;
	}
	
	
	public Students remove() {
		if(size()==0)
			throw new NoSuchElementException();
		Students student=queue[front];
		queue[front]=null;
		front++;
		if(size()==0) {
			front=0;
			back=0;
		}
		return student;
	}
	
	public Students peek() {
		if(size()==0)
			throw new NoSuchElementException();
		return queue[front];
	}
	
	public int size() {
		return back-front;
	}
	
	public void printQueue() {
		for(int i=front;i<back;i++)
			System.out.println(queue[i]);
	}
	
}
